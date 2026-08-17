package com.example.kmpfirstapp.screen.home

import androidx.lifecycle.ViewModel
import com.example.kmpfirstapp.data.repository.HomeRepository
import com.example.kmpfirstapp.model.HomeItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


class HomeViewModel(
    private val repository: HomeRepository
) : ViewModel() {

    private val _items = MutableStateFlow<List<HomeItem>>(emptyList())
    val items: StateFlow<List<HomeItem>> get() = _items

    init {
        loadItems()
    }

    private fun loadItems() {
        _items.value = repository.getHomeItems()
    }
}