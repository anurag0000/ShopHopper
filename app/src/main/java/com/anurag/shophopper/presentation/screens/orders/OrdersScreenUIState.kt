package com.anurag.shophopper.presentation.screens.orders

import com.anurag.shophopper.domain.model.Order

data class OrdersScreenUIState(
    val isLoading: Boolean = true,
    val orders: List<Order> = emptyList()
)