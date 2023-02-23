package com.testclean.domain.usecase

import com.testclean.common.Either
import com.testclean.common.ErrorFactory
import com.testclean.domain.model.CharacterModel

interface CharacterUseCase {
    suspend fun getCharacter(): Either<ErrorFactory, List<CharacterModel>>
}
