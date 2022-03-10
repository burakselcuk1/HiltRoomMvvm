package com.example.hiltroomtest.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.hiltroomtest.model.toDo

@Dao
interface dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertToDo(todo:toDo)

    @Delete
    suspend fun delete(todo: toDo)

    @Query("SELECT * FROM todo ORDER BY text ASC ")
    fun getAllToDos():LiveData<List<toDo>>
}