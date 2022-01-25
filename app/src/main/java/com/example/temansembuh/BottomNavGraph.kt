package com.example.temansembuh

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.temansembuh.screens.BedScreen
import com.example.temansembuh.screens.HomeScreen
import com.example.temansembuh.screens.HospitalScreen
import com.example.temansembuh.screens.ProfileScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Hospital.route) {
            HospitalScreen()
        }
//        composable(route = BottomBarScreen.Bed.route) {
//            BedScreen()
//        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
    }
}