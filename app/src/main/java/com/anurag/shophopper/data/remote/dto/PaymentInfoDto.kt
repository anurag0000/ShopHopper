package com.anurag.shophopper.data.remote.dto

import com.anurag.shophopper.domain.model.PaymentInfo

data class PaymentInfoDto(
    val amount: Double,
    val customer: String,
    val ephemeralKey: String,
    val paymentIntent: String
) {
    fun toPaymentInfo(): PaymentInfo {
        return PaymentInfo(
            customerID = customer,
            ephemeralKey = ephemeralKey,
            clientSecret=paymentIntent,
            amount = amount
        )
    }
}