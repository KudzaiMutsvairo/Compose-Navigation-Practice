package com.kmutswairo.composenavigationdemo.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kmutswairo.composenavigationdemo.presentation.SampleDataViewModel
import com.kmutswairo.composenavigationdemo.presentation.details.DetailsScreen
import com.kmutswairo.composenavigationdemo.presentation.home.HomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.HomeScreen.route) {
        composable(route = Screens.HomeScreen.route) {
            val viewModel = viewModel<SampleDataViewModel>()
            HomeScreen(
                navController = navController,
                uiState = viewModel.uiState,
                onEventSent = viewModel::onEvent,
            )
        }

        composable(route = Screens.DetailsScreen.route) {
            DetailsScreen(
                navController = navController,
            )
        }
    }
}
