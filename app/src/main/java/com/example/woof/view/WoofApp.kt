package com.example.woof.view

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.example.woof.R
import com.example.woof.data.dogs

/**
 * Composable that displays an app bar and a list of dogs.
 */
@Composable
fun WoofApp() {
    
    val paddingSmall = dimensionResource(id = R.dimen.padding_small)
    
    LazyColumn(modifier = Modifier.padding(top = 30.dp)) {
        items(dogs) {
            DogItem(dog = it, modifier = Modifier.padding(paddingSmall))
        }
    }
}