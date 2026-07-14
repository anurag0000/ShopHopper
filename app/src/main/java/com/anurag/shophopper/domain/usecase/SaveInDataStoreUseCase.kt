package com.anurag.shophopper.domain.usecase

import androidx.datastore.preferences.core.Preferences
import com.anurag.shophopper.domain.repository.DataStoreRepository
import javax.inject.Inject

class SaveInDataStoreUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) {
    suspend operator fun <T> invoke(key: Preferences.Key<T>, value: T) {
        dataStoreRepository.saveInDataStore(key = key, value = value)
    }
}