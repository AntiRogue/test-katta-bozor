package com.example.testkattabozor.data.repository

import com.example.testkattabozor.data.api.OffersApi
import com.example.testkattabozor.data.model.Offer
import com.example.testkattabozor.domain.repository.OffersRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class OffersRepositoryImp @Inject constructor(
    private val api: OffersApi
) : OffersRepository {

    override fun getOffers(): Flow<List<Offer>> = flow {
        val response = api.getOffers()

        if (response.isSuccessful && response.body() != null)
            emit(response.body()!!.offers)

    }
}