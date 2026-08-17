package com.example.kmpfirstapp.data.repository

import com.example.kmpfirstapp.model.HomeItem
import com.example.kmpfirstapp.navigation.Screen


class FakeHomeRepository : HomeRepository {

    override fun getHomeItems(): List<HomeItem> {

        return listOf(

            HomeItem(
                title = "Study",
                subtitle = "Start studying",
                route = Screen.Study.route
            ),

            HomeItem(
                title = "Kanji",
                subtitle = "Study Kanji",
                route = Screen.Kanji.route
            ),

            HomeItem(
                title = "Vocabulary",
                subtitle = "Study vocabulary",
                route = Screen.Vocabulary.route
            ),

            HomeItem(
                title = "Grammar",
                subtitle = "Study grammar",
                route = Screen.Grammar.route
            )
        )
    }
}