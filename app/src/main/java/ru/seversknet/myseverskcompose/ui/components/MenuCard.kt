package ru.seversknet.myseverskcompose.ui.components

import android.graphics.Bitmap
import android.service.autofill.OnClickAction
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.seversknet.myseverskcompose.R
import java.lang.reflect.Modifier

@Composable
fun MenuCard(image: Int, action: Unit, listState: ScrollState) {

    Card(modifier = androidx.compose.ui.Modifier
        .clickable { action }
        .size(80.dp, 80.dp)
        .horizontalScroll(listState)) {
        Image(painter = painterResource(id = image), contentDescription = "image")
    }
}

@Preview(showBackground = true)
@Composable
fun showMenuCard() {

}