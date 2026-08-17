package com.example.kmpfirstapp

import android.app.Application
import com.example.kmpfirstapp.di.initializeKoin
import org.koin.android.ext.koin.androidContext


class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initializeKoin {
            androidContext(this@MyApplication)
        }
    }
}