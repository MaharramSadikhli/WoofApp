package com.example.woof.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import com.example.woof.R


@Composable
fun TopAppBarImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.ic_woof_logo),
        contentDescription = null,
        modifier = Modifier
            .size(dimensionResource(id = R.dimen.image_size))
            .padding(dimensionResource(R.dimen.padding_small))
    )
}