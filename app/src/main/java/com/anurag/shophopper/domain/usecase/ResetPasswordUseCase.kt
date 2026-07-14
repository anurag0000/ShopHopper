package com.anurag.shophopper.domain.usecase

import com.anurag.shophopper.domain.repository.NetworkRepository
import javax.inject.Inject

class ResetPasswordUseCase @Inject constructor(
    private val networkRepository: NetworkRepository
) {
    suspend operator fun invoke(token: String, password: String, confirmPassword: String) =
        networkRepository.resetPassword(
            token = token,
            password = password,
            confirmPassword = confirmPassword
        )
}