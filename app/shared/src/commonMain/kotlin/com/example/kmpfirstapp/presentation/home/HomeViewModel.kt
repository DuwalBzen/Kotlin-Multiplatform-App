package com.example.kmpfirstapp.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kmpfirstapp.domain.repository.home.HomeRepository
import com.example.kmpfirstapp.domain.repository.unsplash.UnsplashRepository
import com.example.kmpfirstapp.domain.model.ImageItem
import com.example.kmpfirstapp.model.HomeItem
import com.example.kmpfirstapp.util.RequestState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class HomeViewModel(
    private val repository: HomeRepository,
    private val unsplashRepository: UnsplashRepository
) : ViewModel() {

    private val _items = MutableStateFlow<List<HomeItem>>(emptyList())
    val items: StateFlow<List<HomeItem>> get() = _items


    private val _images =
        MutableStateFlow<RequestState<List<ImageItem>>>(
            RequestState.Idle
        )

    val images =
        _images.asStateFlow()

    init {
        loadItems()
        searchImages("nature")
    }

    private fun loadItems() {
        _items.value = repository.getHomeItems()
    }


    fun searchImages(query: String) {

        viewModelScope.launch {

            _images.value = RequestState.Loading

            try {

                val response = unsplashRepository.searchPhotos(query)
                val images = response.results.map { 
                    ImageItem(id = it.id, urls = it.urls)
                }

                _images.value = RequestState.Success(images)

            } catch (e: Exception) {

                _images.value =
                    RequestState.Error(
                        e.message ?: "Something went wrong"
                    )
            }
        }
    }
}