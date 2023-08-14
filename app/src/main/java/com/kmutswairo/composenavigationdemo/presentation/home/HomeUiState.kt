package com.kmutswairo.composenavigationdemo.presentation.home

import com.kmutswairo.composenavigationdemo.data.SampleDataDto

data class HomeUiState(
    val isLoading: Boolean = false,
    val data: List<SampleDataDto> = emptyList(),
    val error: String? = null
)
