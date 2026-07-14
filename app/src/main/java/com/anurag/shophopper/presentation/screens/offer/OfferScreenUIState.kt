package com.anurag.shophopper.presentation.screens.offer

import com.anurag.shophopper.domain.model.CommonProduct

data class OfferScreenUIState(
    val isLoading: Boolean = true,
    val products: List<CommonProduct> = emptyList()
)