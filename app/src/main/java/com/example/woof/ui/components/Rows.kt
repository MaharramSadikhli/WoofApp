package com.example.woof.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TopAppBarRow(modifier: Modifier = Modifier) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        TopAppBarImage()
        TopAppBarText()
    }
}