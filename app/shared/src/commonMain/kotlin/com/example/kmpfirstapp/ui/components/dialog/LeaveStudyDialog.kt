package com.example.myapplication.ui.components.dialog

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@Composable
fun LeaveStudyDialog(
    title: String = "Leave this session?",
    message: String = "Are you sure you want to leave? Your current study session may not be completed.",
    onLeave: () -> Unit,
    onStay: () -> Unit
) {

    AlertDialog(

        onDismissRequest = onStay,

        title = {

            Text(
                text = title,
                fontWeight = FontWeight.Bold
            )
        },

        text = {

            Text(
                text = message
            )
        },

        confirmButton = {

            TextButton(
                onClick = onLeave
            ) {

                Text(
                    text = "Leave",
                    color = MaterialTheme.colorScheme.error
                )
            }
        },

        dismissButton = {

            TextButton(
                onClick = onStay
            ) {

                Text(
                    text = "Stay"
                )
            }
        }
    )
}