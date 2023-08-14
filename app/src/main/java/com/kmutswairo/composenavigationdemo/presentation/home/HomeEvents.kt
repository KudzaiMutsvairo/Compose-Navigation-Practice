package com.kmutswairo.composenavigationdemo.presentation.home

sealed class HomeEvents {
    object NavigateToDetailsScreen : HomeEvents()
    object GetData : HomeEvents()
}
