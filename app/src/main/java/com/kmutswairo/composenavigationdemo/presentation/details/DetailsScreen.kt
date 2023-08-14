package com.kmutswairo.composenavigationdemo.presentation.details

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailsScreen(
    navController: NavController,
    id: Int,
    title: String,
    description: String,
) {
    Box(modifier = Modifier, contentAlignment = Alignment.Center) {
        Column {
            Text(text = "$id")
            Spacer(modifier = Modifier.height(3.dp))
            Text(text = title)
            Spacer(modifier = Modifier.height(3.dp))
            Text(text = description)
        }
    }
}
