package com.example.kmpfirstapp.ui.kangi

import com.example.kmpfirstapp.data.db.dao.KanjiDao
import com.example.kmpfirstapp.data.db.entity.KanjiEntity
import kotlinx.coroutines.flow.Flow

class FakeKanjiRepository(
    private val dao: KanjiDao
) : KanjiRepository{

    override fun getAllKanji(): Flow<List<KanjiEntity>> {
        return dao.getAllKanji()
    }

    override suspend fun seedFakeData() {
        if (dao.count() == 0) {
            dao.insertAll(
                listOf(
                    KanjiEntity(1, "山", "Mountain"),
                    KanjiEntity(2, "水", "Water"),
                    KanjiEntity(3, "日", "Sun / Day"),
                    KanjiEntity(4, "火", "Fire"),
                    KanjiEntity(5, "木", "Tree")
                )
            )
        }
    }
}