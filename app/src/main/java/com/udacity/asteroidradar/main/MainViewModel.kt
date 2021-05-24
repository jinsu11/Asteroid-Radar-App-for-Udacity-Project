package com.udacity.asteroidradar.main

import android.app.Application
import android.content.Context
import android.util.Log
import android.view.View
import androidx.lifecycle.*
import com.udacity.asteroidradar.Asteroid
import com.udacity.asteroidradar.AsteroidProperty
import com.udacity.asteroidradar.PictureOfDay
import com.udacity.asteroidradar.RecyclerAdapter
import com.udacity.asteroidradar.api.AsteroidApi
import com.udacity.asteroidradar.database.AsteroidDatabase
import com.udacity.asteroidradar.database.AsteroidEntity
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel(application: Application) : AndroidViewModel(application) {
    companion object{
        const val TAG = "MainViewModel"
        const val LOADING = View.VISIBLE
        const val LOADING_DONE = View.GONE
        const val PICTURE_URL = "pictureUrl"
        const val PICTURE_DESCRIPTION = "pictureDescription"
    }

    private val _fetchedAsteroidProperty = MutableLiveData<List<Asteroid>?>()
    val fetchedAsteroidProperty: LiveData<List<Asteroid>?>
        get() = _fetchedAsteroidProperty

    private val _selectedAsteroid = MutableLiveData<Asteroid?>()
    val selectedAsteroid: LiveData<Asteroid?>
        get() = _selectedAsteroid

    private val _pictureUrl = MutableLiveData<String>()
    val pictureUrl: LiveData<String>
        get() = _pictureUrl

    private val _pictureDescription = MutableLiveData<String>()
    val pictureDescription: LiveData<String>
        get() = _pictureDescription

    private val _status = MutableLiveData<Int>()
    val status: LiveData<Int>
        get() = _status

    private val dataSource = AsteroidDatabase.getInstance(application).asteroidDatabaseDao

    private val pref = application.getSharedPreferences("com.udacity.asteroidradar", Context.MODE_PRIVATE)


    init {
        _status.value = LOADING_DONE
    }

    val recyclerAdapter = RecyclerAdapter(RecyclerAdapter.OnClickListener { asteroid ->
        _selectedAsteroid.value = asteroid
    })

    fun getAsteroidProperties(){
        Log.i(TAG, "getAsteroidProperties() 호출")
        viewModelScope.launch {
            _status.value = LOADING
            try {
                val asteroidProperty: AsteroidProperty = AsteroidApi.retrofitService.getProperties()
                val pictureProperty: PictureOfDay = AsteroidApi.retrofitService.getPictureProperty()
                val asteroids = ArrayList<Asteroid>()

                dataSource.clear()
                asteroidProperty.near_earth_objects.values.forEach {
                    it.forEach { property ->
                        val asteroid = Asteroid(
                                property.id.toLong(),
                                property.name,
                                property.close_approach_data[0].close_approach_date,
                                property.absolute_magnitude_h,
                                property.estimated_diameter.kilometers.estimated_diameter_max,
                                property.close_approach_data[0].relative_velocity.kilometers_per_second.toDouble(),
                                property.close_approach_data[0].miss_distance.astronomical.toDouble(),
                                property.is_potentially_hazardous_asteroid)

                        val asteroidEntity = AsteroidEntity(
                                asteroid.id, asteroid.codename, asteroid.closeApproachDate, asteroid.absoluteMagnitude,
                                asteroid.estimatedDiameter, asteroid.relativeVelocity, asteroid.distanceFromEarth, asteroid.isPotentiallyHazardous)

                        asteroids.add(asteroid)
                        dataSource.insert(asteroidEntity)
                    }
                }
                _fetchedAsteroidProperty.value = asteroids.toList()

                pref.edit().apply {
                    putString(PICTURE_URL, pictureProperty.url)
                    putString(PICTURE_DESCRIPTION, pictureProperty.title)
                }.apply()
                _pictureUrl.value = pictureProperty.url
                _pictureDescription.value = pictureProperty.title
            } catch (e: Exception){
                _fetchedAsteroidProperty.value = null
                e.printStackTrace()
            } finally {
                _status.value = LOADING_DONE
            }
        }
    }

    fun getSavedAsteroids(){
        Log.i(TAG, "getSavedAsteroids() 호출")
        viewModelScope.launch {
            try {
                val asteroids: List<AsteroidEntity>? = dataSource.getAllAsteroids()
                asteroids?.let {
                    val parcelableAsteroids = arrayListOf<Asteroid>()
                    asteroids.forEach {
                        val asteroid = Asteroid(it.id, it.codename, it.closeApproachDate, it.absoluteMagnitude,
                                it.estimatedDiameter, it.relativeVelocity, it.distanceFromEarth, it.isPotentiallyHazardous)

                        parcelableAsteroids.add(asteroid)
                    }
                    _fetchedAsteroidProperty.value = parcelableAsteroids.toList()

                    _pictureUrl.value = pref.getString(PICTURE_URL, "")
                    _pictureDescription.value = pref.getString(PICTURE_DESCRIPTION,"")
                }
            } catch (e: Exception){
                e.printStackTrace()
            }
        }
    }

    fun doneNavigating(){
        _selectedAsteroid.value = null
    }
}