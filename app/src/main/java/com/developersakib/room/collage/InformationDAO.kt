package com.developersakib.room.collage

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface InformationDAO {

    @Insert
   suspend fun inserdata(information: Information)

   @Delete
   suspend fun delteData(information: Information)

   @Query("SELECT * FROM information")
    fun getAllInformation() : LiveData<List<Information>>
}