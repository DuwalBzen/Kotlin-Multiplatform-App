package com.example.myapplication.ui.components.dialog

import androidx.compose.runtime.Composable

@Composable
fun ExitDialog(
    onExit: () -> Unit,
    onDismiss: () -> Unit
) {

    ConfirmationDialog(
        title = "Exit",
        message = "Are you sure you want to leave this screen?",
        onConfirm = onExit,
        onDismiss = onDismiss
    )

}