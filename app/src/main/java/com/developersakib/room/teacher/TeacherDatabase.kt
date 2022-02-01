package com.developersakib.room.teacher

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Teacher::class], version = 1)
abstract class TeacherDatabase : RoomDatabase() {

    abstract fun teacherdao() : TeacherDAO
}