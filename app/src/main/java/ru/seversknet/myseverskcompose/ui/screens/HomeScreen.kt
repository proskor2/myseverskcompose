package ru.seversknet.myseverskcompose.ui.screens

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import ru.seversknet.myseverskcompose.R
import ru.seversknet.myseverskcompose.data.singletons.MainLists
import ru.seversknet.myseverskcompose.ui.components.BottomNavigation
import ru.seversknet.myseverskcompose.ui.components.MenuCard
import ru.seversknet.myseverskcompose.ui.components.NewsCard
import ru.seversknet.myseverskcompose.ui.navigation.BottomNavItem
import ru.seversknet.myseverskcompose.ui.navigation.NavGraph

@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    val listnews = MainLists.listNews
    val listState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(listState),

        ) {
            MenuCard(image = R.drawable.frame_news, action = Unit)
            MenuCard(image = R.drawable.frame_events, action = Unit)
            MenuCard(image = R.drawable.frame_problem, action = Unit)
            MenuCard(image = R.drawable.socobj, action = Unit)
            MenuCard(image = R.drawable.frame_service, action = Unit)
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
    HomeScreen()
}