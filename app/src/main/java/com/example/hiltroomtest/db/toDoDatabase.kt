package com.example.hiltroomtest.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.hiltroomtest.model.toDo

@Database(entities = [toDo::class], version = 1, exportSchema = false)
abstract class toDoDatabase : RoomDatabase() {

    abstract fun toDoDao():dao

}