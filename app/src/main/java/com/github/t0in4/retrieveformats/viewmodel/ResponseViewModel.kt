package com.github.t0in4.retrieveformats.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.t0in4.retrieveformats.repository.Repository
import com.github.t0in4.retrieveformats.response.Formats
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ResponseViewModel(
    private val repository: Repository = Repository()
) : ViewModel() {
    val responseState = mutableStateOf(emptyList<Formats>())

    suspend fun getFormats(): Formats {
        return repository.getFormats()
    }
    init {
        viewModelScope.launch(Dispatchers.IO) {
            val formats = getFormats()
            responseState.value = listOf(formats)
        }
    }
}