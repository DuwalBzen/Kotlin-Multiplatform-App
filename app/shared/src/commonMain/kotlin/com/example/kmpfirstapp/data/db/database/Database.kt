package com.example.kmpfirstapp.data.db.database

import androidx.room3.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver

// This part is shared because both Android and iOS can use the bundled SQLite driver.
fun getRoomDatabase(
    builder: RoomDatabase.Builder<AppDatabase>
): AppDatabase {

    return builder
        .setDriver(BundledSQLiteDriver())
        .build()
}