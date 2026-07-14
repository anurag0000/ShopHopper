package com.anurag.shophopper.domain.usecase

import com.anurag.shophopper.domain.repository.NetworkRepository
import javax.inject.Inject

class GetSingleOrderDetailsUseCase @Inject constructor(
    private val networkRepository: NetworkRepository
) {
    suspend operator fun invoke(orderID: String) = networkRepository.getSingleOrderDetails(orderID)
}