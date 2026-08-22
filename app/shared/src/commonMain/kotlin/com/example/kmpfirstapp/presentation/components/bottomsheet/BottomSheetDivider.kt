package com.example.myapplication.ui.components.bottomsheet

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BottomSheetDivider() {

    HorizontalDivider(
        modifier = Modifier.padding(vertical = 8.dp)
    )
}