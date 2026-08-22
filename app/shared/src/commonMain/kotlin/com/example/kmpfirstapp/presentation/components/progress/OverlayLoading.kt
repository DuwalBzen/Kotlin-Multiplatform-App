package com.example.myapplication.ui.components.progress

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

// Add Compose imports

@Composable
fun OverlayLoading(
    isLoading:Boolean
){
    if(isLoading){
        Box(
            Modifier.fillMaxSize()
                .background(Color.Black.copy(alpha=.35f)
                ),
            contentAlignment= Alignment.Center
        ){
            Card(
                shape=RoundedCornerShape(16.dp)
            ){Column(
                Modifier.padding(24.dp),
                horizontalAlignment=Alignment.CenterHorizontally
            ){
                CircularProgressIndicator()
                Spacer(Modifier.height(16.dp))
                Text("Loading...")
            }
            }
        }
    }
}