package com.example.myapplication.ui.components.progress

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

// Add Compose imports

@Composable
fun LinearLoading(){
    LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
}