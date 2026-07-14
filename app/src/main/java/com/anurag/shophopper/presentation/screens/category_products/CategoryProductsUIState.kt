package com.anurag.shophopper.presentation.screens.category_products

import com.anurag.shophopper.domain.model.CommonProduct

data class CategoryProductsUIState(
    val isLoading: Boolean = true,
    val products: List<CommonProduct> = emptyList()
)
