package com.example.kmpfirstapp.domain.model

import com.example.kmpfirstapp.data.remote.dto.Urls
import kotlinx.serialization.Serializable

@Serializable
data class ImageItem(
    val id: String,
    val urls: Urls
)