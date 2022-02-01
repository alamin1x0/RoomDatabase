package com.developersakib.room.collage

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Information")
data class Information(
    @PrimaryKey(autoGenerate = true)
    val Id : Int,
    val name : String,
    val address : String
)
