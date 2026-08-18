package com.example.myapplication.ui.components

data class Category(
    val id: Int,
    val title: String,
    val subtitle: String,
    val icon: String
)

val categoryList = listOf(

    Category(
        id = 1,
        title = "JLPT N5",
        subtitle = "Beginner Japanese Kanji",
        icon = "📘"
    ),

    Category(
        id = 2,
        title = "JLPT N4",
        subtitle = "Elementary Japanese Kanji",
        icon = "📗"
    ),

    Category(
        id = 3,
        title = "JLPT N3",
        subtitle = "Intermediate Japanese Kanji",
        icon = "📙"
    ),

    Category(
        id = 4,
        title = "Favorite Kanji",
        subtitle = "Your saved kanji",
        icon = "⭐"
    ),

    Category(
        id = 5,
        title = "Kanji Quiz",
        subtitle = "Test your knowledge",
        icon = "🎯"
    )
)