package com.anurag.shophopper.domain.usecase

import com.anurag.shophopper.domain.repository.NetworkRepository
import javax.inject.Inject

class GetCategoryProductsUseCase @Inject constructor(
    private val networkRepository: NetworkRepository
) {
    suspend operator fun invoke(categoryName: String) =
        networkRepository.getCategoryProducts(categoryName = categoryName)
}