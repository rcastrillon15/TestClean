package com.testclean.network

import com.testclean.response.CharacterResponse

interface CharacterService {
    suspend fun getCharacter(): List<CharacterResponse>
}
