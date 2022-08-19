package ru.seversknet.myseverskcompose.ui.components

import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import ru.seversknet.myseverskcompose.ui.navigation.BottomNavItem

@Composable
fun BottomNavigation(navController: NavController) {
    val items = listOf(BottomNavItem.Home, BottomNavItem.Appeal, BottomNavItem.Profile)
    androidx.compose.material.BottomNavigation {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(selected = currentRoute == item.route, onClick = {
              navController.navigate(item.route){
                  navController.graph.startDestinationRoute?.let { route ->
                      popUpTo(route){
                          saveState = true
                      }
                  }
                  launchSingleTop = true
                  restoreState = true
              }
            },
            icon = { Icon(painter = painterResource(id = item.icon), contentDescription = item.title) },
            label = { Text(text = item.title) })
        }
    }
}