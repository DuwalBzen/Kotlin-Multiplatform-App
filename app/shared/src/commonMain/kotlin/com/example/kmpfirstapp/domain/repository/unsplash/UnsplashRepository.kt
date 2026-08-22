package com.example.kmpfirstapp.domain.repository.unsplash

import com.example.kmpfirstapp.data.response.SearchPhotosResponse

interface UnsplashRepository{

    suspend fun searchPhotos(query: String): SearchPhotosResponse

}
