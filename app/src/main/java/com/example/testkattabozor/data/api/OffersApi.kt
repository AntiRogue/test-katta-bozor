package com.example.testkattabozor.data.api

import com.example.testkattabozor.data.model.OffersResponse
import retrofit2.Response
import retrofit2.http.GET

interface OffersApi {

    @GET("offers")
    suspend fun getOffers(): Response<OffersResponse>

}