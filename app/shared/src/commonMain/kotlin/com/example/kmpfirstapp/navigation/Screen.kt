package com.example.kmpfirstapp.navigation



sealed class Screen(
    val route: String
) {

    data object Home : Screen("home")

    data object Study : Screen("study")

    data object Kanji : Screen("kanji")

    data object Vocabulary : Screen("vocabulary")

    data object Grammar : Screen("grammar")

    data object Settings : Screen("settings")
}