package com.example.testkattabozor.domain.use_case

import com.example.testkattabozor.domain.repository.OffersRepository
import javax.inject.Inject

class GetOffersUseCase @Inject constructor(
    private val repository: OffersRepository
) {
    operator fun invoke() =
        repository.getOffers()

}