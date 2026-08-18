package com.example.myapplication.ui.components.progress

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Add Compose imports

@Composable
fun FullScreenLoading(
    message:String="Loading..."
){
    Box(
        Modifier.fillMaxSize(),
        contentAlignment= Alignment.Center
    ){
        Column(
            horizontalAlignment=Alignment.CenterHorizontally
        ){
            CircularProgressIndicator()
            Spacer(
                Modifier.height(16.dp)
            )
            Text(message)
        }
    }
}