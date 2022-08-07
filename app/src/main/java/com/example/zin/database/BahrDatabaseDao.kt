package com.example.zin.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface BahrDatabaseDao {

    @Insert
    suspend fun insert(item: Bahr)

    @Update
    suspend fun update(item: Bahr)


    @Query("SELECT * FROM poems_history_table WHERE bahrId = :key")
    suspend fun get(key: Long): Bahr?


    @Query("DELETE FROM poems_history_table")
    suspend fun clear()

    @Query("SELECT * FROM poems_history_table ORDER BY bahrId DESC")
    suspend fun getAll(): LiveData<List<Bahr>>

    @Query("SELECT * FROM poems_history_table ORDER BY bahrId DESC LIMIT 1")
    suspend fun getCurrent(): Bahr?


    @Query("SELECT * FROM poems_history_table WHERE bahrId = :key")
    suspend fun getCurrentWithId(key: Long): LiveData<Bahr>
}