package com.testclean.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.testclean.domain.usecase.CharacterUseCase
import javax.inject.Inject
import kotlinx.coroutines.launch

class CharacterViewModel @Inject constructor(private val useCase: CharacterUseCase) : ViewModel() {

    init {
        getCharacter()
    }

    private fun getCharacter() {
        viewModelScope.launch {
            useCase.getCharacter()
        }
    }
}
