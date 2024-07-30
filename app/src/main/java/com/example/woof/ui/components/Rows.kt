package com.example.woof.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.woof.R
import com.example.woof.data.Dog
import com.example.woof.view.DogIcon
import com.example.woof.view.DogInformation
import com.example.woof.view.DogItemButton


@Composable
fun TopAppBarRow(modifier: Modifier = Modifier) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        TopAppBarImage()
        TopAppBarText()
    }
}

@Composable
fun DogItemRow(dog: Dog, expanded: Boolean, modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(R.dimen.padding_small))
    ) {
        DogIcon(dog.imageResourceId)
        DogInformation(dog.name, dog.age)
        Spacer(modifier = Modifier.weight(1f))
        DogItemButton(expanded = expanded, onClick = { /*TODO*/ })
    }
}