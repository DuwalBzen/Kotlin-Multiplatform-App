package com.example.kmpfirstapp.ui.kangi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kmpfirstapp.data.db.entity.KanjiEntity
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch


class KanjiViewModel(
    private val repository: KanjiRepository
) : ViewModel() {

    val kanjiList: StateFlow<List<KanjiEntity>> =
        repository
            .getAllKanji()
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5000),
                initialValue = emptyList()
            )

    init {
        viewModelScope.launch {
            repository.seedFakeData()
        }
    }
}