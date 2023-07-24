package com.example.testkattabozor.presentation.screens.offers.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.testkattabozor.data.model.Offer

@Composable
fun OfferComponent(
    offer: Offer
) {
    Column(
        modifier = Modifier
            .padding(bottom = 24.dp)
            .fillMaxWidth()
    ) {

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(327 / 180f)
                .background(shape = MaterialTheme.shapes.large, color = Color.Transparent),
            painter = rememberAsyncImagePainter(model = offer.image.url),
            contentDescription = null
        )

        Text(
            modifier = Modifier.padding(top = 12.dp),
            text = offer.name
        )
        Text(text = offer.brand)
        Text(text = offer.category)
        Text(text = offer.merchant)

        offer.attributes.forEach {
            Text(text = it.name + " " + it.value)
        }
    }
}