package com.example.kmpfirstapp.di

import com.example.kmpfirstapp.data.db.dao.KanjiDao
import com.example.kmpfirstapp.data.db.database.AppDatabase
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule = module {

    //"Koin, find the AppDatabase you already created."
    //then gets the DAO from it.
    single<KanjiDao> {
        get<AppDatabase>().kanjiDao()
    }

}
