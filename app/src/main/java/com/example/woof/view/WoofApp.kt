package com.example.woof.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.woof.data.dogs

/**
 * Composable that displays an app bar and a list of dogs.
 */
@Composable
fun WoofApp() {
    LazyColumn {
        items(dogs) {
            DogItem(dog = it)
        }
    }
}