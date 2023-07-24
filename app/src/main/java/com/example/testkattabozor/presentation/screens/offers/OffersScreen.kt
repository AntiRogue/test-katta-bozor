package com.example.testkattabozor.presentation.screens.offers

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.testkattabozor.presentation.screens.offers.components.OfferComponent

@Composable
fun OffersScreen(
    viewModel: OffersViewModel = hiltViewModel()
) {

    val state by viewModel.state.collectAsState()

    LazyColumn(
        contentPadding = PaddingValues(top = 24.dp, start = 24.dp, end = 24.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        if (state.loading)
            item {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }

        items(state.offers ?: return@LazyColumn) {
            OfferComponent(offer = it)
        }

    }

}