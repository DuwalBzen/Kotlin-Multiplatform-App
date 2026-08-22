package com.example.kmpfirstapp.domain.repository.kanji

import com.example.kmpfirstapp.data.db.entity.KanjiEntity
import kotlinx.coroutines.flow.Flow

interface KanjiRepository {
    fun getAllKanji(): Flow<List<KanjiEntity>>
    suspend fun seedFakeData()
}