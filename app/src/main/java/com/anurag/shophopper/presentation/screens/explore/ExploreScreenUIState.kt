package com.anurag.shophopper.presentation.screens.explore

import com.anurag.shophopper.domain.model.Category

data class ExploreScreenUIState(
    val isLoading: Boolean = false,
    val searchQuery: String = "",
    val categories: List<Category>? = null,
    val searchResultsList: List<String> = emptyList()
)
