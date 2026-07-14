package com.anurag.shophopper.core.util

import retrofit2.HttpException
import com.anurag.shophopper.domain.model.Error

fun HttpException.parseToErrorModel(): Error {
    return Error("")
}