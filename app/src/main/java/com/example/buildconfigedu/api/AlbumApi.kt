package com.example.buildconfigedu.api

import com.example.buildconfigedu.model.Album
import retrofit2.Call
import retrofit2.http.GET

interface AlbumApi {
    @GET("albums")
    fun getAlbums(): Call<List<Album>>
}