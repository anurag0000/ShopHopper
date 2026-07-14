package com.anurag.shophopper.data.remote.dto

data class OTPResponseDto(
    val message: String,
    val resetToken: String,
    val status: String
)