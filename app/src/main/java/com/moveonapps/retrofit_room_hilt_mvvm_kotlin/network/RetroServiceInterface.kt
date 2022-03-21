package com.moveonapps.retrofit_room_hilt_mvvm_kotlin.network

import com.moveonapps.retrofit_room_hilt_mvvm_kotlin.model.RepositoriesList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroServiceInterface {

    @GET("repositories")
    fun getDataFromAPI(@Query("q")query: String): Call<RepositoriesList>
}