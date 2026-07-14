package com.anurag.shophopper.domain.usecase

import com.anurag.shophopper.core.util.Resource
import com.anurag.shophopper.domain.model.CommonProduct
import com.anurag.shophopper.domain.repository.NetworkRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchUseCase @Inject constructor(
    private val networkRepository: NetworkRepository
) {
    suspend operator fun invoke(query: String): Flow<Resource<List<CommonProduct>>> {
        return networkRepository.search(query)
    }
}