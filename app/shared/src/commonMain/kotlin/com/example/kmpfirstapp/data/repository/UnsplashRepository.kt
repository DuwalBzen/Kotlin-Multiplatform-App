package com.example.kmpfirstapp.data.repository

import com.example.kmpfirstapp.data.remote.dto.UnsplashPhotoDto
import com.example.kmpfirstapp.data.response.SearchPhotosResponse
import com.example.kmpfirstapp.util.RequestState

interface UnsplashRepository{

    suspend fun searchPhotos(query: String): SearchPhotosResponse

}
