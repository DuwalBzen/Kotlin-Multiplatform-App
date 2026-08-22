package com.example.kmpfirstapp.data.db.entity

import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity
data class KanjiEntity(
    @PrimaryKey
    val id: Int,
    val kanji: String,
    val meaning: String
)