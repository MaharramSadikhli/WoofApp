package com.example.woof.ui.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.woof.R



@Composable
fun TopAppBarText(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.app_name),
        style = MaterialTheme.typography.displayLarge
    )
}


@Composable
fun DogNameText(@StringRes dogName: Int, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(dogName),
        style = MaterialTheme.typography.displayMedium,
        modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
    )
}


@Composable
fun DogAgeText(dogAge: Int, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.years_old, dogAge),
        style = MaterialTheme.typography.bodyLarge
    )
}