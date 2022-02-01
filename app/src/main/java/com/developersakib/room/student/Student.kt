package com.developersakib.room.student

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Student")
data class Student(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val name : String,
    val age : Int
)
