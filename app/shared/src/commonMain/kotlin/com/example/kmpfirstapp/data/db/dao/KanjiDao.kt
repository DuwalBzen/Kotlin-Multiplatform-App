package com.example.kmpfirstapp.data.db.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.OnConflictStrategy
import androidx.room3.Query
import com.example.kmpfirstapp.data.db.entity.KanjiEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface KanjiDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(items: List<KanjiEntity>)

    @Query("SELECT * FROM KanjiEntity")
    fun getAllKanji(): Flow<List<KanjiEntity>>

    @Query("SELECT COUNT(*) FROM KanjiEntity")
    suspend fun count(): Int
}