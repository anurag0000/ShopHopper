package com.anurag.shophopper.domain.model

data class HomeResponse(
    val categories: List<String>,
    val topSales: List<CommonProduct>,
    val freshSales: List<CommonProduct>,
    val recommended:List<CommonProduct>
)