package com.example.kmpfirstapp.data.db.database

import android.content.Context
import androidx.room3.Room
import androidx.room3.RoomDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/*AppDatabase.android.kt
→ knows how Android creates the builder

PlatformModule.android.kt
→ registers it with Koin*/
fun getDatabaseBuilder(
    context: Context
): RoomDatabase.Builder<AppDatabase> {

    val appContext = context.applicationContext

    val dbFile =
        appContext.getDatabasePath("kanji_master.db")

    return Room.databaseBuilder<AppDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}
