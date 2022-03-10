package com.example.hiltroomtest.repository

import androidx.lifecycle.LiveData
import com.example.hiltroomtest.db.dao
import com.example.hiltroomtest.model.toDo
import javax.inject.Inject

class toDoRepository @Inject constructor(private val toDoDao:dao) {

    suspend fun insertToDo(toDo: toDo) = toDoDao.insertToDo(toDo)
    suspend fun deleteToDo(toDo: toDo) = toDoDao.delete(toDo)
    val readAllData: LiveData<List<toDo>> = toDoDao.getAllToDos()

}