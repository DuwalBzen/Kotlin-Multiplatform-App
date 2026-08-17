package com.example.kmpfirstapp

import androidx.compose.ui.window.ComposeUIViewController
import com.example.kmpfirstapp.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    // initializeKoin fun whenever our iso application start
    configure = { initializeKoin() }
) { App() }