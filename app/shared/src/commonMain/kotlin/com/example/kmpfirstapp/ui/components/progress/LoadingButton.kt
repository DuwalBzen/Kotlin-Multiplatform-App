package com.example.myapplication.ui.components.progress

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Add Compose imports

@Composable
fun LoadingButton(
    text:String,
    loading:Boolean,
    onClick:()->Unit
){
    Button(
        onClick=onClick,
        enabled=!loading
    ){
        if(loading){
            CircularProgressIndicator(
                modifier= Modifier.size(20.dp),
                strokeWidth=2.dp
            )
        }else{
            Text(text)
        }
    }
}