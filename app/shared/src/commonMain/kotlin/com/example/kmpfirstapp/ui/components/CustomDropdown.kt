package com.example.myapplication.ui.components

import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun <T> CustomDropdown(

    label: String,

    selected: T,

    items: List<T>,

    itemText: (T) -> String,

    onSelected: (T) -> Unit

) {


    var expanded by remember {

        mutableStateOf(false)

    }



    ExposedDropdownMenuBox(

        expanded = expanded,


        onExpandedChange = {

            expanded = !expanded

        }

    ) {



        OutlinedTextField(

            value =
                itemText(selected),


            onValueChange = {},


            readOnly = true,


            label = {

                Text(label)

            },


            trailingIcon = {

                ExposedDropdownMenuDefaults
                    .TrailingIcon(
                        expanded
                    )

            },


            modifier = Modifier

                .fillMaxWidth()

                .menuAnchor()

        )




        ExposedDropdownMenu(

            expanded = expanded,


            onDismissRequest = {

                expanded = false

            }

        ) {



            items.forEach { item ->



                DropdownMenuItem(


                    text = {


                        Text(

                            itemText(item)

                        )

                    },


                    onClick = {


                        onSelected(item)


                        expanded = false


                    }

                )


            }


        }


    }


}