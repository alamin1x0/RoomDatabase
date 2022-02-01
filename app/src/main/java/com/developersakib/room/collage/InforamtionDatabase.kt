package com.developersakib.room.collage

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Information::class], version = 1)
abstract class InforamtionDatabase : RoomDatabase(){
    abstract fun informationdao() : InformationDAO
}