package com.example.kmpfirstapp.ui.kangi

import com.example.kmpfirstapp.data.db.dao.KanjiDao
import com.example.kmpfirstapp.data.db.entity.KanjiEntity
import kotlinx.coroutines.flow.Flow

interface KanjiRepository {
    fun getAllKanji(): Flow<List<KanjiEntity>>
    suspend fun seedFakeData()
}