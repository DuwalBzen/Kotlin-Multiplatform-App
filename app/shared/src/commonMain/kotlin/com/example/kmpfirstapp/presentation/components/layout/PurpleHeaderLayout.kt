package com.example.kmpfirstapp.presentation.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PurpleHeaderLayout(
    title: String? = null,
    subtitle1: String? = null,
    subtitle2: String? = null,
    onBackClick: (() -> Unit)? = null,
    navigationContent: @Composable (() -> Unit)? = null,
    modifier: Modifier = Modifier,
    headerBottomPadding: Dp = 24.dp,
    content: @Composable ColumnScope.() -> Unit
) {

    Box(
        modifier = modifier
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

        // ---------------------------------------------------------
        // Decorative circles
        // ---------------------------------------------------------

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


        // ---------------------------------------------------------
        // Purple Header
        // ---------------------------------------------------------

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp)
                .statusBarsPadding()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
        ) {

            // -----------------------------------------------------
            // Back / Navigation button
            // -----------------------------------------------------

            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
            ) {

                when {

                    navigationContent != null -> {
                        navigationContent()
                    }

                    onBackClick != null -> {

                    }
                }
            }


            // -----------------------------------------------------
            // Title / Subheadings
            // -----------------------------------------------------

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(
                        bottom = headerBottomPadding
                    )
            ) {

                // Normal title
                if (title != null) {

                    Text(
                        text = title,
                        fontSize = 42.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                } else {

                    // First subheading
                    subtitle1?.let {

                        Text(
                            text = it,
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }


                    // Second subheading
                    subtitle2?.let {

                        Text(
                            text = it,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White.copy(
                                alpha = 0.85f
                            ),
                            modifier = Modifier
                                .padding(top = 4.dp)
                        )
                    }
                }
            }
        }


        // ---------------------------------------------------------
        // Body
        // ---------------------------------------------------------

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(
                    top = 190.dp
                ),

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
                        vertical = 12.dp
                    )
            ) {

                content()
            }
        }
    }
}