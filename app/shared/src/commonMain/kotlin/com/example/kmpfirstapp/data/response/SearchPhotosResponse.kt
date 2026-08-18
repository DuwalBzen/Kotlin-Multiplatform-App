package com.example.kmpfirstapp.data.response

import com.example.kmpfirstapp.data.remote.dto.UnsplashPhotoDto
import kotlinx.serialization.Serializable

@Serializable
data class SearchPhotosResponse(

    val total: Int,

    val total_pages: Int,

    val results: List<UnsplashPhotoDto>

)