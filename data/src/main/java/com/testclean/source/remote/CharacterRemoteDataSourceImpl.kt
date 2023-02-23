package com.testclean.source.remote

import com.testclean.common.Either
import com.testclean.common.ErrorFactory
import com.testclean.network.CharacterService
import com.testclean.response.CharacterResponse
import javax.inject.Inject

class CharacterRemoteDataSourceImpl @Inject constructor(private val service: CharacterService) :
    CharacterRemoteDataSource {
    override suspend fun getCharacter(): Either<ErrorFactory, List<CharacterResponse>> =
        try {
            val response = service.getCharacter()

            Either.Right(response)

        } catch (exception: Exception) {
            Either.Left(ErrorFactory(errorCode = exception.hashCode()))
        }
}