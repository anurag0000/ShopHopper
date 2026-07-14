package com.anurag.shophopper.domain.usecase

import com.anurag.shophopper.core.util.Resource
import com.anurag.shophopper.domain.repository.NetworkRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DeleteFromCartUseCase @Inject constructor(
    private val networkRepository: NetworkRepository
) {
    suspend operator fun invoke(productID: String): Flow<Resource<Unit>> {
        return networkRepository.removeFromCart(productID = productID)
    }
}