package com.anurag.shophopper.presentation.screens.offer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anurag.shophopper.core.util.onResponse
import com.anurag.shophopper.domain.usecase.GetOfferProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OfferViewModel @Inject constructor(
    private val getOfferProductsUseCase: GetOfferProductsUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow(OfferScreenUIState())
    val uiState = _uiState.asStateFlow()

    init {
        getOfferProducts()
    }

    private fun getOfferProducts() {
        viewModelScope.launch(Dispatchers.IO) {
            getOfferProductsUseCase()
                .onResponse(
                    onLoading = {
                        _uiState.update { it.copy(isLoading = true) }
                    },
                    onSuccess = { response ->
                        _uiState.update { it.copy(isLoading = false, products = response!!) }
                    },
                    onFailure = {}
                )
        }
    }
}