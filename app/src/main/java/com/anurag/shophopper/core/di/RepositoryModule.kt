package com.anurag.shophopper.core.di

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.anurag.shophopper.data.remote.ShopHopperAPI
import com.anurag.shophopper.data.repository.DataStoreRepositoryImpl
import com.anurag.shophopper.data.repository.NetworkRepositoryImpl
import com.anurag.shophopper.domain.repository.DataStoreRepository
import com.anurag.shophopper.domain.repository.NetworkRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideNetworkRepository(api: ShopHopperAPI): NetworkRepository {
        return NetworkRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideDataStoreRepository(dataStore: DataStore<Preferences>): DataStoreRepository {
        return DataStoreRepositoryImpl(dataStore)
    }

}