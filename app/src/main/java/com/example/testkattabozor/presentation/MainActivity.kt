package com.example.testkattabozor.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.testkattabozor.presentation.screens.offers.OffersScreen
import com.example.testkattabozor.presentation.ui.theme.TestKattaBozorTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestKattaBozorTheme {
                OffersScreen()
            }
        }
    }
}