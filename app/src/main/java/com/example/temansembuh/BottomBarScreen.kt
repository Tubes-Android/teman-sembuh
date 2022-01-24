package com.example.temansembuh

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

    object Hospital: BottomBarScreen(
        route = "hospital",
        title = "Hospital",
        icon = Icons.Default.Place
    )

    object Bed: BottomBarScreen(
        route = "bed",
        title = "Bed",
        icon = Icons.Default.Favorite
    )
}
