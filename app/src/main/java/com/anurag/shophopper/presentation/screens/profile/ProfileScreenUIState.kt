package com.anurag.shophopper.presentation.screens.profile

import com.anurag.shophopper.domain.model.User

data class ProfileScreenUIState(
    val isLoading: Boolean = true,
    val me: User? = null
)
