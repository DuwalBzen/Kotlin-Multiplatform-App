package com.example.myapplication.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun DropdownMenuBox(

    text: String,

    items: List<String>,

    onSelected: (String) -> Unit

) {

    var expanded by remember {
        mutableStateOf(false)
    }


    Box {

        OutlinedButton(

            onClick = {
                expanded = true
            },

            modifier = Modifier
                .fillMaxWidth()

        ) {

            Text(
                text = text
            )

        }



        DropdownMenu(

            expanded = expanded,

            onDismissRequest = {
                expanded = false
            }

        ) {


            items.forEach { item ->


                DropdownMenuItem(

                    text = {

                        Text(
                            text = item
                        )

                    },


                    onClick = {


                        onSelected(
                            item
                        )


                        expanded = false


                    }

                )


            }

        }

    }

}