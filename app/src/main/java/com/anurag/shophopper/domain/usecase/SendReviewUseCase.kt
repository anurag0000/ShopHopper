package com.anurag.shophopper.domain.usecase

import com.anurag.shophopper.core.util.Resource
import com.anurag.shophopper.domain.repository.NetworkRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SendReviewUseCase @Inject constructor(
    private val networkRepository: NetworkRepository
) {
    suspend operator fun invoke(
        productID: String,
        review: String,
        rating: Float
    ): Flow<Resource<Unit>> {
        return networkRepository.sendReview(
            productID = productID,
            review = review,
            rating = rating
        )
    }
}