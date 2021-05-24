package com.udacity.asteroidradar.api

import com.udacity.asteroidradar.AsteroidProperty
import com.udacity.asteroidradar.BuildConfig
import com.udacity.asteroidradar.Config
import com.udacity.asteroidradar.PictureOfDay
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "https://api.nasa.gov"

private val okHttpClient = OkHttpClient.Builder()
    .addInterceptor { apiKeyInterceptor(it) }
    .build()

private fun apiKeyInterceptor(it: Interceptor.Chain): Response{
    val originalRequest = it.request()
    val originalHttpUrl = originalRequest.url()

    val newHttpUrl = originalHttpUrl.newBuilder()
        .addQueryParameter("api_key", Config.API_KEY)
        .build()

    val newRequest = originalRequest.newBuilder()
        .url(newHttpUrl)
        .build()

    return it.proceed(newRequest)
}

private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .build()

interface AsteroidApiService {
    @GET("/neo/rest/v1/feed")
    suspend fun getProperties(): AsteroidProperty

    @GET("planetary/apod")
    suspend fun getPictureProperty(): PictureOfDay

//    @GET("/neo/rest/v1/feed")
//    suspend fun getProperties(@Query("api_key") apiKey: String = API_KEY): AsteroidProperty
//
//    @GET("planetary/apod")
//    suspend fun getPictureProperty(@Query("api_key") apiKey: String = API_KEY): PictureOfDay
}

object AsteroidApi {
    val retrofitService: AsteroidApiService by lazy {
        retrofit.create(AsteroidApiService::class.java)
    }
}
