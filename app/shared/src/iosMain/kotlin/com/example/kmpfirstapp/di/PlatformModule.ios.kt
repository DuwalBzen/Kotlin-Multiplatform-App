package com.example.kmpfirstapp.di



import com.example.kmpfirstapp.data.db.database.AppDatabase
import com.example.kmpfirstapp.data.db.database.getDatabaseBuilder
import com.example.kmpfirstapp.data.db.database.getRoomDatabase
import org.koin.core.module.Module
import org.koin.dsl.module

//PlatformModule.ios.kt should only tell Koin how to provide that database.
actual val platformModule: Module = module {

    single<AppDatabase> {
        getRoomDatabase(
            getDatabaseBuilder()
        )
    }
}