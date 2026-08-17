package com.example.kmpfirstapp.data.repository

import com.example.kmpfirstapp.model.HomeItem

interface HomeRepository {

    fun getHomeItems(): List<HomeItem>
}