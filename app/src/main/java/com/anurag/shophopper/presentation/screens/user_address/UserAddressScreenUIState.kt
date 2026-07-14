package com.anurag.shophopper.presentation.screens.user_address

import com.anurag.shophopper.domain.model.PaymentInfo
import com.anurag.shophopper.domain.model.UserAddress

data class UserAddressScreenUIState(
    val isLoading: Boolean = true,
    val addressList: List<UserAddress> = emptyList(),
    val selectedAddress: Int = 0,
    val isButtonLoading: Boolean = false,
    val isOrderCompleted: Boolean = false,
    val paymentInfo: PaymentInfo? = null
)