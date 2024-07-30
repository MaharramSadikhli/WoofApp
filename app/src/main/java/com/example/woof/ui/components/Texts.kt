package com.example.woof.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.woof.R



@Composable
fun TopAppBarText(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.app_name),
        style = MaterialTheme.typography.displayLarge
    )
}