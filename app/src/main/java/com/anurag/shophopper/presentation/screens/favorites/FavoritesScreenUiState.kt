package com.anurag.shophopper.presentation.screens.favorites

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import com.anurag.shophopper.domain.model.CommonProduct

data class FavoritesScreenUiState(
    val isLoading: Boolean = true,
    val wishlist: SnapshotStateList<CommonProduct> = mutableStateListOf()
)
