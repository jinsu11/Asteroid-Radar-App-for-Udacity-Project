package com.udacity.asteroidradar.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AsteroidDao {
    @Insert
    suspend fun insert(asteroid: AsteroidEntity)

    @Query("SELECT * FROM asteroid ORDER BY close_approach_date ASC")
    suspend fun getAllAsteroids(): List<AsteroidEntity>?

    @Query("DELETE FROM asteroid")
    suspend fun clear()

}