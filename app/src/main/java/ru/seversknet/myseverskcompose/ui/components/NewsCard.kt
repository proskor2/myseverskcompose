package ru.seversknet.myseverskcompose.ui.components

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.seversknet.myseverskcompose.R
import ru.seversknet.myseverskcompose.data.models.News
import ru.seversknet.myseverskcompose.ui.theme.Typography

@Composable
fun NewsCard(image: Bitmap?, title: String, description: String) {
    val imageplug = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.city)
    Card(
        modifier = Modifier
            .padding(6.dp)
            .height(60.dp)
            .fillMaxWidth()
            .clickable { }
    ) {
        Row(
            modifier = Modifier
                .padding(4.dp)
        ) {
            Image(
                bitmap = image?.asImageBitmap() ?: imageplug.asImageBitmap(),
                contentDescription = "image"
            )
            Column(
                modifier = Modifier
                    .padding(start = 4.dp, end = 4.dp)
            ) {
                Text(text = title, style = Typography.h1)
                Text(text = description, style = Typography.h2)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun showNewsCard() {
    NewsCard(image = null, title = "Новость", description = "Описание новости")
}