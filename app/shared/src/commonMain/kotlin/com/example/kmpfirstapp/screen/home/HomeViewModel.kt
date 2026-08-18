package com.example.kmpfirstapp.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kmpfirstapp.data.repository.HomeRepository
import com.example.kmpfirstapp.data.repository.UnsplashRepository
import com.example.kmpfirstapp.model.HomeItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import co.touchlab.kermit.Logger


class HomeViewModel(
    private val repository: HomeRepository,
    private val unsplashRepository: UnsplashRepository
) : ViewModel() {

    private val _items = MutableStateFlow<List<HomeItem>>(emptyList())
    val items: StateFlow<List<HomeItem>> get() = _items

    init {
        loadItems()
        searchImages()
    }

    private fun loadItems() {
        _items.value = repository.getHomeItems()
    }


    fun searchImages() {

        viewModelScope.launch {

            val data = unsplashRepository.searchPhotos("Nature")
            Logger.d("MUGI $data" )

            }
    }
}