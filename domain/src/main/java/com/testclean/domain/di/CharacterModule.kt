package com.testclean.domain.di

import com.testclean.domain.repository.CharacterRepository
import com.testclean.domain.repository.CharacterRepositoryImpl
import com.testclean.domain.usecase.CharacterUseCase
import com.testclean.domain.usecase.CharacterUseCaseImpl
import com.testclean.source.remote.CharacterRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object CharacterModule {

    @Provides
    fun providerRepository(remoteDataSource: CharacterRemoteDataSource):CharacterRepository = CharacterRepositoryImpl(
        remoteDataSource = remoteDataSource
    )

    @Provides
    fun providerUseCase(repository: CharacterRepository): CharacterUseCase =
        CharacterUseCaseImpl(repository = repository)

}
