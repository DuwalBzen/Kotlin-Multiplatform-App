package com.example.myapplication.ui.components.progress
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier

// Add Compose imports

@Composable
fun ProgressScreen(
    loading: Boolean,
    content: @Composable () -> Unit
) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        content()

        OverlayLoading(
            isLoading = loading
        )
    }
}