package com.example.hiltroomtest.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltroomtest.model.toDo
import com.example.hiltroomtest.repository.toDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListFragmentViewModel @Inject constructor(private val repository: toDoRepository):ViewModel() {

    val _movie = MutableLiveData<List<toDo>>()
    val readAllData: LiveData<List<toDo>>

    init {

        readAllData = repository.readAllData
    }





}