package com.anurag.shophopper.domain.model

data class PaymentInfo(
    val customerID: String,
    val ephemeralKey: String,
    val clientSecret: String,
    val amount:Double,
)
