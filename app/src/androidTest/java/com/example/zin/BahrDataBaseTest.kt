package com.example.zin
import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.zin.database.BahrDatabase
import com.example.zin.database.BahrDatabaseDao
import org.junit.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class BahrDataBaseTest {

    private lateinit var sleepDao: BahrDatabaseDao
    private lateinit var db: BahrDatabase
}