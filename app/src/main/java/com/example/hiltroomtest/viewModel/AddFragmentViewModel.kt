package com.example.hiltroomtest.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltroomtest.model.toDo
import com.example.hiltroomtest.repository.toDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddFragmentViewModel @Inject constructor(private val repository: toDoRepository):ViewModel(){

    fun addTodo(toDo: toDo) = viewModelScope.launch{
        repository.insertToDo(toDo)
    }
}