package com.testclean.domain.mapper

import com.testclean.domain.model.CharacterModel
import com.testclean.response.CharacterResponse

fun CharacterResponse.toModel() = CharacterModel(
    id = id,
    name = name,
    status = status
)
