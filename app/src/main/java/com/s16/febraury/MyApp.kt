package com.s16.febraury

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "A") {
        composable("A") {
            LoginActivity(navController)
        }
        composable("B") {
            HomeActivity(navController)
        }

    }
}