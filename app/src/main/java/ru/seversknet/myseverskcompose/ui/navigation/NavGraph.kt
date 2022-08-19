package ru.seversknet.myseverskcompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.seversknet.myseverskcompose.ui.screens.AppealScreen
import ru.seversknet.myseverskcompose.ui.screens.HomeScreen
import ru.seversknet.myseverskcompose.ui.screens.ProfileScreen

@Composable
fun NavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomNavItem.Home.route){
        composable(BottomNavItem.Home.route){
            HomeScreen()
        }

        composable(BottomNavItem.Appeal.route){
            AppealScreen()
        }

        composable(BottomNavItem.Profile.route){
            ProfileScreen()
        }
    }
}