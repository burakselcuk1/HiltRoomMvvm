package com.example.hiltroomtest.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo")
data class toDo(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val text:String
)
