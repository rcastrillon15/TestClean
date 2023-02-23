package com.testclean.domain.repository

import com.testclean.common.Either
import com.testclean.common.ErrorFactory
import com.testclean.domain.model.CharacterModel

interface CharacterRepository {
    suspend fun getCharacter(): Either<ErrorFactory, List<CharacterModel>>
}
