package com.example.zin.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "poems_history_table")
data class Bahr(

    @PrimaryKey(autoGenerate = true)
    var bahrId: Long = 0L,

    @ColumnInfo(name = "first_shatr")
    var firstShatr: String = "",

    @ColumnInfo(name = "second_shatr")
    var secondShatr: String = "",

    @ColumnInfo(name = "Bahr_name")
    var bahr: String = ""
)