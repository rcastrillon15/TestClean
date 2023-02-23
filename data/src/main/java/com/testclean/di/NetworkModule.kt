package com.testclean.di

import com.testclean.network.CharacterService
import com.testclean.source.remote.CharacterRemoteDataSource
import com.testclean.source.remote.CharacterRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun providerService(service: CharacterService): CharacterRemoteDataSource =
        CharacterRemoteDataSourceImpl(service = service)
}
