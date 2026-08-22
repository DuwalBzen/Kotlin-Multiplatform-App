package com.example.kmpfirstapp.domain.repository.home

import com.example.kmpfirstapp.model.HomeItem

interface HomeRepository {

    fun getHomeItems(): List<HomeItem>
}