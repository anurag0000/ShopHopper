package com.anurag.shophopper.domain.usecase

import com.anurag.shophopper.domain.repository.NetworkRepository
import javax.inject.Inject

class SendOTPEmailUseCase @Inject constructor(
    private val networkRepository: NetworkRepository
) {
    suspend operator fun invoke(email: String) = networkRepository.getResetPasswordOTP(email)
}