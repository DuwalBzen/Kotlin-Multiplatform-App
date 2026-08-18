package com.example.myapplication.ui.components.bottomsheet

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomSheetAction(
    val title: String,
    val icon: ImageVector,
    val onClick: () -> Unit
)