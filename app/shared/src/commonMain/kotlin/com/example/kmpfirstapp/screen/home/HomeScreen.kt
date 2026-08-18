package com.example.kmpfirstapp.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kmpfirstapp.model.HomeItem
import com.example.kmpfirstapp.navigation.Screen
import com.example.kmpfirstapp.ui.components.layout.HomeBackground
import org.koin.compose.viewmodel.koinViewModel


@Composable
fun HomeScreen(
    onItemClick: (HomeItem) -> Unit,
    viewModel: HomeViewModel = koinViewModel()
) {

    val items by viewModel.items.collectAsState()

    HomeBackground(
        onMenuClick = {

        }
    ){
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentPadding = PaddingValues(8.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            items(items) { item ->

                HomeItemCard(
                    item = item,
                    onClick = {
                        onItemClick(item)
                    }
                )
            }
        }
    }

}