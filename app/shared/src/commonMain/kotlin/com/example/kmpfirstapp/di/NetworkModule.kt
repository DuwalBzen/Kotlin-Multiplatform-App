package com.example.kmpfirstapp.di

import com.example.kmpfirstapp.domain.repository.unsplash.UnsplashRepository
import com.example.kmpfirstapp.domain.repository.unsplash.UnsplashRepositoryImpl
import com.example.kmpfirstapp.network.createHttpClient
import io.ktor.client.HttpClient
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val networkModule = module {

    single<HttpClient> {
        createHttpClient()
    }

    singleOf(::UnsplashRepositoryImpl) bind UnsplashRepository::class
}