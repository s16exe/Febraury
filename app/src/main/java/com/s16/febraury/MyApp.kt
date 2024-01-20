package com.s16.febraury

import NavigationActivity
import android.health.connect.datatypes.units.Temperature
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
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
            MicroMacro(navController)
        }
        composable("C") {
            NavigationActivity(navController)
        }
        composable("D") {
            NavigationActivity1(navController)
        }
        composable("E") {
            Temperature_Humidity(navController)
        }
        composable("F") {
            PollutantsActivity(navController)
        }
        composable("G") {
            Temperature_Humidity1(navController)
        }
        composable("H") {
            PollutantsActivity1(navController)
        }


    }
}

