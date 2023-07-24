package com.example.testkattabozor.domain.repository

import com.example.testkattabozor.data.model.Offer
import kotlinx.coroutines.flow.Flow

interface OffersRepository {

    fun getOffers(): Flow<List<Offer>>

}