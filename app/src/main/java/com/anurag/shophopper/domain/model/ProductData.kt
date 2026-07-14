package com.anurag.shophopper.domain.model

data class ProductData(
    val productInfo: SingleProductInfo = SingleProductInfo(),
    val recommendedProducts: List<CommonProduct> = emptyList(),
)
