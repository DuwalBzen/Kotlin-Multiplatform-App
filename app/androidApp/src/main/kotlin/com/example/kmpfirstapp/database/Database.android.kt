package com.example.kmpfirstapp.database

import android.content.Context
import androidx.room3.Room
import androidx.room3.RoomDatabase
import com.example.kmpfirstapp.data.db.database.AppDatabase

fun getDatabaseBuilder(
    context: Context
): RoomDatabase.Builder<AppDatabase> {

    val dbFile = context.applicationContext
        .getDatabasePath("kanji_master.db")

    return Room.databaseBuilder<AppDatabase>(
        context = context.applicationContext,
        name = dbFile.absolutePath
    )
}
