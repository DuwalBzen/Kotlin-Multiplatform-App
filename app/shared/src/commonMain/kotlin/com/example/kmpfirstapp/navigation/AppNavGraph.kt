package com.example.kmpfirstapp.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kmpfirstapp.screen.home.HomeScreen


@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {

        composable(Screen.Home.route) {

            HomeScreen(
                onItemClick = { item ->

                    when (item.route) {
                        Screen.Study.route ->
                            navController.navigate(Screen.Study.route)

                        Screen.Kanji.route ->
                            navController.navigate(Screen.Kanji.route)
                    }
                }
            )
        }

        composable(
            route = Screen.Study.route
        ) {
            // StudyScreen later
        }

        composable(
            route = Screen.Kanji.route
        ) {
            // KanjiScreen later
        }

        composable(
            route = Screen.Vocabulary.route
        ) {
            // VocabularyScreen later
        }

        composable(
            route = Screen.Grammar.route
        ) {
            // GrammarScreen later
        }

        composable(
            route = Screen.Settings.route
        ) {
            // SettingsScreen later
        }
    }
}