package com.testclean.source.remote

import com.testclean.common.Either
import com.testclean.common.ErrorFactory
import com.testclean.response.CharacterResponse

interface CharacterRemoteDataSource {
    suspend fun getCharacter(): Either<ErrorFactory, List<CharacterResponse>>
}
