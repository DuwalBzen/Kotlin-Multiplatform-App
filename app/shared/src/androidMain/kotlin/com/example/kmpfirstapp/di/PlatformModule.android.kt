package com.example.kmpfirstapp.di

import com.example.kmpfirstapp.data.db.database.AppDatabase
import com.example.kmpfirstapp.data.db.database.getDatabaseBuilder
import com.example.kmpfirstapp.data.db.database.getRoomDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

actual val platformModule = module {

    single<AppDatabase> {

        getRoomDatabase(
            getDatabaseBuilder(
                androidContext()
            )
        )
    }
}