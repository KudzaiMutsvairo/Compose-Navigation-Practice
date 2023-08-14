package com.kmutswairo.composenavigationdemo.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kmutswairo.composenavigationdemo.data.DataProvider
import com.kmutswairo.composenavigationdemo.presentation.home.HomeEvents
import com.kmutswairo.composenavigationdemo.presentation.home.HomeUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class SampleDataViewModel : ViewModel() {

    val dataProvider: DataProvider = DataProvider()

    private var _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState

    fun onEvent(event: HomeEvents) {
        when (event) {
            is HomeEvents.GetData -> {
                getSampleData()
            }

            is HomeEvents.NavigateToDetailsScreen -> {
                // TODO: Navigate to details screen
            }
        }
    }

    private fun getSampleData() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            try {
                val data = dataProvider.getSampleData()
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    data = data,
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = e.message,
                )
            }
        }
    }
}
