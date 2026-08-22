package com.example.kmpfirstapp.data.db.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import com.example.kmpfirstapp.data.db.entity.KanjiEntity

@Dao
interface KanjiDao {

    @Insert
    suspend fun insertKanji(kanji: KanjiEntity)

    @Query("SELECT * FROM KanjiEntity")
    suspend fun getAllKanji(): List<KanjiEntity>

    @Query("DELETE FROM KanjiEntity")
    suspend fun deleteAll()
}