package com.example.kmpfirstapp.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class UnsplashPhotoDto(
  val id: String,
  val urls: Urls
)