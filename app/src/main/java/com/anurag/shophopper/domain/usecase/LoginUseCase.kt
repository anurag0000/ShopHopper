package com.anurag.shophopper.domain.usecase

import com.anurag.shophopper.core.util.Resource
import com.anurag.shophopper.domain.model.LoginResponse
import com.anurag.shophopper.domain.repository.NetworkRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val networkRepository: NetworkRepository
) {
    suspend operator fun invoke(email: String, password: String): Flow<Resource<LoginResponse>> {
        return networkRepository.login(email = email, password = password)
    }
}