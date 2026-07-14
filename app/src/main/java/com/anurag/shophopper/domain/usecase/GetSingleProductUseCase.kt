package com.anurag.shophopper.domain.usecase

import com.anurag.shophopper.core.util.Resource
import com.anurag.shophopper.domain.model.ProductData
import com.anurag.shophopper.domain.model.SingleProductInfo
import com.anurag.shophopper.domain.repository.NetworkRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSingleProductUseCase @Inject constructor(
    private val networkRepository: NetworkRepository
) {
    suspend operator fun invoke(productID: String): Flow<Resource<ProductData>> {
        return networkRepository.getSingleProduct(id = productID)
    }
}