package com.example.woof.view

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.woof.R
import com.example.woof.data.Dog
import com.example.woof.ui.components.DogItemRow

/**
 * Composable that displays a list item containing a dog icon and their information.
 *
 * @param dog contains the data that populates the list item
 * @param modifier modifiers to set to this composable
 */
@Composable
fun DogItem(
    dog: Dog, expanded: Boolean, onClick: () -> Unit, modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        DogItemRow(dog = dog, expanded = expanded, onClick = onClick)
        if (expanded) {
            DogHobby(
                dogHobby = dog.hobbies, modifier = Modifier.padding(
                    start = dimensionResource(id = R.dimen.padding_medium),
                    top = dimensionResource(id = R.dimen.padding_small),
                    end = dimensionResource(id = R.dimen.padding_medium),
                    bottom = dimensionResource(id = R.dimen.padding_medium)
                )
            )
        }

    }
}
