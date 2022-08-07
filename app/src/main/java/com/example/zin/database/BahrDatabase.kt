package com.example.zin.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Bahr::class], version = 1, exportSchema = false)
abstract class BahrDatabase: RoomDatabase(){

    abstract val bahrDatabaseDao: BahrDatabaseDao

    companion object {
        @Volatile
        private var INSTANCE: BahrDatabase? = null


        fun getInstance(context: Context): BahrDatabase {
            synchronized(this) {

                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        BahrDatabase::class.java,
                        "poems_history_database"
                    )

                        .fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance
                }
                return instance
            }
        }
    }


}