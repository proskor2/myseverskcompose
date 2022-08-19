package ru.seversknet.myseverskcompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MenuCard(image: Int, action: Unit) {

    Card(modifier = androidx.compose.ui.Modifier
        .clickable { action }
        .size(80.dp, 80.dp)) {
        Image(painter = painterResource(id = image), contentDescription = "image")
    }
}

@Preview(showBackground = true)
@Composable
fun showMenuCard() {

}