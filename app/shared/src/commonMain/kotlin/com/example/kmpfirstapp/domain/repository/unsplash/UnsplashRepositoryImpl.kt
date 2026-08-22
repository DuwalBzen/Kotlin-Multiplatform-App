package com.example.kmpfirstapp.domain.repository.unsplash

import com.example.kmpfirstapp.data.response.SearchPhotosResponse
import com.example.kmpfirstapp.network.ApiRoutes
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class UnsplashRepositoryImpl(
    private val client: HttpClient
) : UnsplashRepository {

    override suspend fun searchPhotos(
        query: String
    ): SearchPhotosResponse {

        return client.get(ApiRoutes.SEARCH_PHOTOS){
            parameter("query", query)
        }.body()
    }
}