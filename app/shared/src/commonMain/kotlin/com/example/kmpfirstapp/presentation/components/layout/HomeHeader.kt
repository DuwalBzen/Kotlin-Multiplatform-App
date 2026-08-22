package com.example.kmpfirstapp.presentation.components.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeHeader(
    onMenuClick: () -> Unit
) {

    val greeting = "おはよう！"

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(
                start = 20.dp,
                end = 20.dp,
                top = 12.dp
            )
    ) {

        /*
         * MENU BUTTON
         *
         * No circular background
         */

        IconButton(

            onClick = onMenuClick,

            modifier = Modifier.size(40.dp)

        ) {

            Icon(

                imageVector = Icons.Default.Menu,

                contentDescription =
                    "Menu",

                modifier =
                    Modifier.size(27.dp),

                tint =
                    Color.White
            )
        }


        Spacer(
            modifier =
                Modifier.height(16.dp)
        )


        /*
         * GREETING
         */

        Text(

            text =
                greeting,

            fontSize =
                38.sp,

            fontWeight =
                FontWeight.Bold,

            color =
                Color.White
        )


        Spacer(
            modifier =
                Modifier.height(6.dp)
        )


        Text(

            text =
                "Ready to learn Japanese?",

            fontSize =
                16.sp,

            color =
                Color.White.copy(
                    alpha = 0.9f
                )
        )
    }
}