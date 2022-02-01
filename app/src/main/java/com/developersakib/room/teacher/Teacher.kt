package com.developersakib.room.teacher

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Teacher")
data class Teacher(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name : String,
    val addres : String
)
