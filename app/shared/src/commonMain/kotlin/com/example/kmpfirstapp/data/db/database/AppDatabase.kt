package com.example.kmpfirstapp.data.db.database

import androidx.room3.ConstructedBy
import androidx.room3.Database
import androidx.room3.RoomDatabase
import com.example.kmpfirstapp.data.db.dao.KanjiDao
import com.example.kmpfirstapp.data.db.entity.KanjiEntity

@Database(
    entities = [KanjiEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun kanjiDao(): KanjiDao
}
