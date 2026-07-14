package com.anurag.shophopper.presentation.screens.orders

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anurag.shophopper.core.util.onResponse
import com.anurag.shophopper.domain.usecase.GetMyOrdersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OrdersViewModel @Inject constructor(
    private val getMyOrdersUseCase: GetMyOrdersUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow(OrdersScreenUIState())
    val uiState = _uiState.asStateFlow()

    init {
        getMyOrders()
    }
    private fun getMyOrders() {
        viewModelScope.launch(Dispatchers.IO) {
            getMyOrdersUseCase()
                .onResponse(
                    onLoading = {
                        _uiState.update { it.copy(isLoading = true) }
                    },
                    onSuccess = { response ->
                        _uiState.update { it.copy(isLoading = false, orders = response!!) }
                    },
                    onFailure = {}
                )
        }
    }
}