package com.anurag.shophopper.presentation.screens.single_order

import com.anurag.shophopper.domain.model.SingleOrder

data class SingleOrderScreenUIState(
    val isLoading: Boolean = true,
    val order: SingleOrder? = null
)
