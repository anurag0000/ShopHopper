package com.anurag.shophopper.presentation.screens.home

import com.anurag.shophopper.domain.model.Category
import com.anurag.shophopper.domain.model.CommonProduct

data class HomeScreenUIState(
    val searchQuery: String = "",
    val categoryList: List<Category> = mutableListOf(),
    val topSalesList: List<CommonProduct> = mutableListOf(),
    val freshSalesList: List<CommonProduct> = mutableListOf(),
    val isLoading: Boolean = false,
    val errorMsg: String? = null,
    val searchResultsList: List<String> = mutableListOf(),
    val recommended: List<CommonProduct> = emptyList()
)
