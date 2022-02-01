package com.developersakib.room.teacher

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TeacherDAO {

    @Insert
    suspend fun insertData(teacher:Teacher)

    @Delete
    suspend fun deleteData(teacher: Teacher)

    @Query("SELECT * FROM teacher")
    fun getAllTeacher() : LiveData<List<Teacher>>
}