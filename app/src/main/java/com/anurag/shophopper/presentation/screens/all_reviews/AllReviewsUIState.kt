package com.anurag.shophopper.presentation.screens.all_reviews

import com.anurag.shophopper.domain.model.Review

data class AllReviewsUIState(
    val isLoading: Boolean = true,
    val currentFilter: Int = 0,
    val reviews: List<Review> = emptyList(),
    val totalReviews: Int = 0
)