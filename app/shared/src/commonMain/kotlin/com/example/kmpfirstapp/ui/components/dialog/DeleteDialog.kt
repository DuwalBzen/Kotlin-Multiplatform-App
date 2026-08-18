package com.example.myapplication.ui.components.dialog

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DeleteDialog(
    itemName: String,
    onDelete: () -> Unit,
    onDismiss: () -> Unit
) {

    AppDialog(
        title = "Delete",
        onDismiss = onDismiss,
        content = {

            Text(
                "Delete \"$itemName\"?"
            )

        },
        confirmButton = {

            Button(
                onClick = onDelete,
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.error
                )
            ) {

                Text("Delete")

            }

        },
        dismissButton = {

            OutlinedButton(
                onClick = onDismiss
            ) {

                Text("Cancel")

            }

        }
    )
}