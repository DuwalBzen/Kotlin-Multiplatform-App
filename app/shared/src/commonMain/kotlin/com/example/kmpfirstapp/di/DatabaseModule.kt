package com.example.kmpfirstapp.di

import com.example.kmpfirstapp.data.db.dao.KanjiDao
import com.example.kmpfirstapp.data.db.database.AppDatabase
import com.example.kmpfirstapp.ui.kangi.FakeKanjiRepository
import com.example.kmpfirstapp.ui.kangi.KanjiRepository
import com.example.kmpfirstapp.ui.kangi.KanjiViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

val databaseModule = module {

    //"Koin, find the AppDatabase you already created."
    //then gets the DAO from it.
    single<KanjiDao> {
        get<AppDatabase>().kanjiDao()
    }


/*    If something asks Koin for:
       KanjiRepository
    ↓
    give it:
    KanjiRepository
  */
    singleOf(::FakeKanjiRepository) bind KanjiRepository::class


    viewModelOf(::KanjiViewModel)

}
