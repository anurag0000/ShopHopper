package com.anurag.shophopper.domain.model

data class User(
    val name:String,
    val id:String,
    val active:Boolean,
    val email:String,
    val role:String,
    val phoneNumber:String
)
