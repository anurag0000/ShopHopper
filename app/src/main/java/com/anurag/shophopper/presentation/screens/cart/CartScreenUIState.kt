package com.anurag.shophopper.presentation.screens.cart

import com.anurag.shophopper.domain.model.CartItem

data class CartScreenUIState(
    val isLoading: Boolean = true,
    val cartItems: MutableList<CartItem> = mutableListOf()
)
