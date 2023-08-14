package com.kmutswairo.composenavigationdemo.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.flow.StateFlow

@Composable
fun HomeScreen(
    navController: NavController,
    uiState: StateFlow<HomeUiState>,
    onEventSent: (HomeEvents) -> Unit,
) {
    val uiStateData = uiState.collectAsState()

    Column {
        Button(onClick = {
            onEventSent(HomeEvents.GetData)
        }) {
            Text(text = "Get data")
        }
        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn {
            items(uiStateData.value.data) { data ->
                DataItem(data = data)
            }
        }
    }
}
