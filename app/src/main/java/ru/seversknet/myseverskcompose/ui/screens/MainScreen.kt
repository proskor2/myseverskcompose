package ru.seversknet.myseverskcompose.ui.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import ru.seversknet.myseverskcompose.ui.components.BottomNavigation
import ru.seversknet.myseverskcompose.ui.navigation.NavGraph


@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomNavigation(navController = navController) }) {
        NavGraph(navController = navController)
    }
}
