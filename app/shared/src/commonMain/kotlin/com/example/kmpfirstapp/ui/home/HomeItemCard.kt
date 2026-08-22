package com.example.kmpfirstapp.ui.home


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kmpfirstapp.model.HomeItem

@Composable
fun HomeItemCard(
    item: HomeItem,
    onClick: () -> Unit
) {

    Card(
        onClick = onClick
    ) {

        Column(
            modifier = Modifier.padding(20.dp)
        ) {

            Text(
                text = item.title
            )

            Text(
                text = item.subtitle
            )
        }
    }
}