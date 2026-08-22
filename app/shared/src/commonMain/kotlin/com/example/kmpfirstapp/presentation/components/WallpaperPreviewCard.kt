package com.example.myapplication.ui.components


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun WallpaperPreviewCard(){


    Card(

        modifier =
            Modifier.fillMaxWidth()

    ){


        Column(

            modifier =
                Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),


            horizontalAlignment =
                Alignment.CenterHorizontally


        ){


            Text(

                text =
                    "Wallpaper Preview",

                style =
                    MaterialTheme
                        .typography
                        .titleMedium

            )


            Spacer(
                Modifier.height(20.dp)
            )


            Text(

                text =
                    "漢",

                fontSize =
                    70.sp

            )


            Text(

                text =
                    "かん",

                fontSize =
                    24.sp

            )


            Text(

                text =
                    "Chinese Character",

                fontSize =
                    18.sp

            )


        }


    }


}