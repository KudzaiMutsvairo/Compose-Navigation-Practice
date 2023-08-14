package com.kmutswairo.composenavigationdemo.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kmutswairo.composenavigationdemo.data.SampleDataDto

@Composable
fun DataItem(
    modifier: Modifier = Modifier,
    data: SampleDataDto,
) {
    Column {
        Row {
            Text(text = "${data.id}")
            Spacer(modifier = Modifier.width(3.dp))
            Text(text = data.title)
        }
        Spacer(modifier = Modifier.height(3.dp))
        Text(text = data.description)
    }
}
