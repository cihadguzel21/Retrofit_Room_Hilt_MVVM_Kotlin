package com.moveonapps.retrofit_room_hilt_mvvm_kotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.moveonapps.retrofit_room_hilt_mvvm_kotlin.model.RepositoryData
import com.moveonapps.retrofit_room_hilt_mvvm_kotlin.network.RetroRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val repository: RetroRepository)
    : ViewModel(){

    fun getAllRepositoryList(): LiveData<List<RepositoryData>> {
        return repository.getAllRecords()
    }

    fun makeApiCall() {
        repository.makeApiCall("ny")
    }
}