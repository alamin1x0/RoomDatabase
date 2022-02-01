package com.developersakib.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.developersakib.room.collage.InforamtionDatabase
import com.developersakib.room.collage.Information
import com.developersakib.room.student.Student
import com.developersakib.room.student.StudentDatabase
import com.developersakib.room.teacher.Teacher
import com.developersakib.room.teacher.TeacherDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var database: StudentDatabase
    private lateinit var database1:TeacherDatabase
    private lateinit var database2:InforamtionDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(applicationContext,
            StudentDatabase::class.java,
            "studentDB").build()

        database1 = Room.databaseBuilder(applicationContext,
            TeacherDatabase::class.java,
            "TeacherDB").build()

        database2 = Room.databaseBuilder(applicationContext,InforamtionDatabase::class.java,
            "informationDB").build()



        GlobalScope.launch {
            database.studentDao().insertStudent(Student(0, "Al-Amin", 21))
            database1.teacherdao().insertData(Teacher(0, "Al-Amin", "sakib"))
            database2.informationdao().inserdata(Information(0,"Nasim","Dinajpur"))

        }
    }
}