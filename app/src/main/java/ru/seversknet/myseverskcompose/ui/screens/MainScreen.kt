package ru.seversknet.myseverskcompose.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.seversknet.myseverskcompose.R
import ru.seversknet.myseverskcompose.data.singletons.MainLists
import ru.seversknet.myseverskcompose.ui.components.MenuCard
import ru.seversknet.myseverskcompose.ui.components.NewsCard

@Composable
fun MainScreen() {
    val listnews = MainLists.listNews
    val listState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            MenuCard(image = R.drawable.frame_news, action = Unit, listState)
            MenuCard(image = R.drawable.frame_events, action = Unit, listState)
            MenuCard(image = R.drawable.frame_problem, action = Unit, listState)
            MenuCard(image = R.drawable.socobj, action = Unit, listState)
            MenuCard(image = R.drawable.frame_service, action = Unit, listState)
        }

        Divider(modifier = Modifier.padding(top = 4.dp, bottom = 4.dp))

        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(listnews) {
                NewsCard(image = null, title = it.title, description = it.description)
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun showMainScreen() {
    MainScreen()
}