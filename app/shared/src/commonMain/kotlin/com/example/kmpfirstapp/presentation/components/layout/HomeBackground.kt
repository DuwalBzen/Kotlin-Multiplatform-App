package com.example.kmpfirstapp.presentation.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeBackground(
    onMenuClick: () -> Unit,
    content: @Composable ColumnScope.() -> Unit
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF9B55E8),
                        Color(0xFFB05CE8),
                        Color(0xFF9652DF)
                    )
                )
            )
    ) {

        /*
         * =================================================
         * DECORATIVE CIRCLES
         * =================================================
         */

        Box(
            modifier = Modifier
                .size(230.dp)
                .offset(
                    x = 115.dp,
                    y = (-70).dp
                )
                .background(
                    Color.White.copy(alpha = 0.06f),
                    CircleShape
                )
        )

        Box(
            modifier = Modifier
                .size(180.dp)
                .offset(
                    x = (-75).dp,
                    y = 145.dp
                )
                .background(
                    Color.White.copy(alpha = 0.07f),
                    CircleShape
                )
        )

        Box(
            modifier = Modifier
                .size(95.dp)
                .align(Alignment.TopEnd)
                .offset(
                    x = 30.dp,
                    y = 150.dp
                )
                .background(
                    Color.White.copy(alpha = 0.05f),
                    CircleShape
                )
        )


        /*
  * =================================================
  * FLOATING KANJI
  * =================================================
  */

// Upper-left
        FloatingKanji(
            kanji = "学",
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(
                    x = 75.dp,
                    y = 65.dp
                ),
            size = 34.sp,
            rotation = -15f
        )

// Upper-right
        FloatingKanji(
            kanji = "日",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(
                    x = (-28).dp,
                    y = 65.dp
                ),
            size = 38.sp,
            rotation = 12f
        )

// Upper-middle-right
        FloatingKanji(
            kanji = "本",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(
                    x = (-105).dp,
                    y = 105.dp
                ),
            size = 26.sp,
            rotation = -8f
        )

// Lower-left
        FloatingKanji(
            kanji = "語",
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(
                    x = 55.dp,
                    y = 155.dp
                ),
            size = 28.sp,
            rotation = 10f
        )

// Lower-right
        FloatingKanji(
            kanji = "読",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(
                    x = (-38).dp,
                    y = 160.dp
                ),
            size = 30.sp,
            rotation = -12f
        )


        /*
         * =================================================
         * HOME HEADER
         * =================================================
         */

        HomeHeader(
            onMenuClick = onMenuClick
        )


        /*
         * =================================================
         * WHITE BODY
         * =================================================
         */

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 190.dp),

            shape = RoundedCornerShape(
                topStart = 30.dp,
                topEnd = 30.dp
            ),

            color = MaterialTheme
                .colorScheme
                .background
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = 16.dp,
                        vertical = 20.dp
                    )
            ) {
                content()
            }
        }
    }
}

@Composable
fun FloatingKanji(
    kanji: String,
    modifier: Modifier = Modifier,
    size: TextUnit = 40.sp,
    rotation: Float = 0f
) {

    Text(
        text = kanji,
        modifier = modifier
            .rotate(rotation),
        fontSize = size,
        fontWeight = FontWeight.Bold,
        color = Color.White.copy(alpha = 0.10f)
    )
}