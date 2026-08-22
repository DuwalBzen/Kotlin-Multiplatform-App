package com.example.kmpfirstapp.data.db.database

import androidx.room3.Room
import androidx.room3.RoomDatabase
import kotlinx.cinterop.ExperimentalForeignApi
import org.koin.dsl.module
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSFileManager
import platform.Foundation.NSUserDomainMask

//AppDatabase.ios.kt should know how to create the iOS Room database builder.
fun getDatabaseBuilder():
        RoomDatabase.Builder<AppDatabase> {

    val dbFilePath =
        documentDirectory() + "/kanji_master.db"

    return Room.databaseBuilder<AppDatabase>(
        name = dbFilePath
    )
}

@OptIn(ExperimentalForeignApi::class)
private fun documentDirectory(): String {

    val directory =
        NSFileManager.defaultManager.URLForDirectory(
            directory = NSDocumentDirectory,
            inDomain = NSUserDomainMask,
            appropriateForURL = null,
            create = false,
            error = null
        )

    return requireNotNull(directory?.path)
}
