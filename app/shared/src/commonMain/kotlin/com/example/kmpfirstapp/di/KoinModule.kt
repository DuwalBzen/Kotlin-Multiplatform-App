package com.example.kmpfirstapp.di


import com.example.kmpfirstapp.data.repository.FakeHomeRepository
import com.example.kmpfirstapp.data.repository.HomeRepository
import com.example.kmpfirstapp.ui.home.HomeViewModel
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.bind
import org.koin.dsl.module

val koinModule = module{

    singleOf(::FakeHomeRepository) bind HomeRepository::class
    //Whenever something asks Koin for HomeRepository, provide FakeHomeRepository.


    viewModelOf(::HomeViewModel)
    //Koin knows how to create HomeViewModel.

}


/*Updated KoinModule.kt to include platformModule in the initializeKoin function. This completes the dependency chain for KanjiViewModel.*/
fun initializeKoin(
    config: KoinAppDeclaration = {}
) {
    startKoin {
        config()
        modules(koinModule, networkModule, databaseModule, platformModule)
    }
}