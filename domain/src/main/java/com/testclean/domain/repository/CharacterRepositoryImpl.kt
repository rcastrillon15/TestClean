package com.testclean.domain.repository

import com.testclean.common.Either
import com.testclean.common.ErrorFactory
import com.testclean.domain.mapper.toModel
import com.testclean.domain.model.CharacterModel
import com.testclean.source.remote.CharacterRemoteDataSource
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(private val remoteDataSource: CharacterRemoteDataSource) :
    CharacterRepository {
    override suspend fun getCharacter(): Either<ErrorFactory, List<CharacterModel>> {

        return when (val response = remoteDataSource.getCharacter()) {
            is Either.Right -> Either.Right(response.r.map { it.toModel() })
            is Either.Left -> Either.Left(response.l)
        }
    }
}
