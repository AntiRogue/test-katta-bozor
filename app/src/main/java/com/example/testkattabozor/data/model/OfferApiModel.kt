package com.example.testkattabozor.data.model

data class OffersResponse(
    val offers: List<Offer>
)

data class Attribute(
    val name: String,
    val value: String
)

data class Image(
    val height: Int,
    val url: String,
    val width: Int
)

data class Offer(
    val attributes: List<Attribute>,
    val brand: String,
    val category: String,
    val id: Int,
    val image: Image,
    val merchant: String,
    val name: String
)