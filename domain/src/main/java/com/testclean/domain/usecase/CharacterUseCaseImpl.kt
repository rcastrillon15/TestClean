package com.testclean.domain.usecase

import com.testclean.common.Either
import com.testclean.common.ErrorFactory
import com.testclean.domain.model.CharacterModel
import com.testclean.domain.repository.CharacterRepository
import javax.inject.Inject

class CharacterUseCaseImpl @Inject constructor(private val repository: CharacterRepository) :
    CharacterUseCase {
    override suspend fun getCharacter(): Either<ErrorFactory, List<CharacterModel>> =
        repository.getCharacter()
}
