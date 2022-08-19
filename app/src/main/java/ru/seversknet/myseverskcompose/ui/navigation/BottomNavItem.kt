package ru.seversknet.myseverskcompose.ui.navigation

import ru.seversknet.myseverskcompose.R

sealed class BottomNavItem(var title: String, var icon: Int, var route: String ){
  object Home: BottomNavItem("Главная", R.drawable.ic_home, "home_screen")
  object Appeal: BottomNavItem("Обратиться", R.drawable.ic_add_appeal, "appeal_screen")
  object Profile: BottomNavItem("Профиль", R.drawable.ic_profile, "profile_screen")
}