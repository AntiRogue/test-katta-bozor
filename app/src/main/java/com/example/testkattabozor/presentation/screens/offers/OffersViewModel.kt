package com.example.testkattabozor.presentation.screens.offers

import androidx.lifecycle.viewModelScope
import com.example.testkattabozor.common.architecture.BaseViewModel
import com.example.testkattabozor.data.model.Offer
import com.example.testkattabozor.domain.use_case.GetOffersUseCase
import com.example.testkattabozor.presentation.screens.offers.OffersViewModel.Effect
import com.example.testkattabozor.presentation.screens.offers.OffersViewModel.Input
import com.example.testkattabozor.presentation.screens.offers.OffersViewModel.State
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import javax.inject.Inject

@HiltViewModel
class OffersViewModel @Inject constructor(
    private val getOffersUseCase: GetOffersUseCase
) : BaseViewModel<State, Input, Effect>(State()) {

    init {
        getOffers()
    }

    data class State(
        val offers: List<Offer>? = null,
        val loading: Boolean = false
    )

    class Input

    class Effect

    override fun processInput(input: Input) {}

    private fun getOffers() = getOffersUseCase()
        .stateOnStart { it.copy(loading = true) }
        .stateOnEach { state, value -> state.copy(offers = value) }
        .stateOnComplete { it.copy(loading = false) }
        .launchIn(viewModelScope)


}

