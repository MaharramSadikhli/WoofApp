package com.example.woof.view

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.woof.R
import com.example.woof.data.dogs
import com.example.woof.ui.components.TopAppBarRow

/**
 * Composable that displays an app bar and a list of dogs.
 */
@Composable
fun WoofApp() {

    val paddingSmall = dimensionResource(id = R.dimen.padding_small)

    Scaffold(
        topBar = { WooTopAppBar() }
    ) {
        LazyColumn(contentPadding = it) {
            items(dogs) { dog ->
                DogItem(dog = dog, modifier = Modifier.padding(paddingSmall))
            }
        }
    }
}

/**
 * Composable that displays a top app bar.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WooTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            TopAppBarRow()
        }, modifier = modifier
    )
}