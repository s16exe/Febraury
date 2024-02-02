package com.s16.febraury

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.s16.febraury.Screens.*
import com.s16.febraury.Screens.Local.*
import com.s16.febraury.Screens.Network.*

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "Login") {
        composable("Login") {
            LoginActivity(navController)
        }
        composable("LocalNetwork") {
            LocalNetwork(navController)
        }
        composable("LocalNavActivity") {
            LocalNavActivity(navController)
        }

        composable("LocalTempActivity") {
            LocalTempActivity(navController)
        }
        composable("LocalPollutantsActivity") {
            LocalPollutantsActivity(navController)
        }
        composable("NetCityActivity") {
            NetCityActivity(navController)
        }
        composable("NetListActivity") {
            NetListActivity(navController)
        }
        composable("NetNavActivity") {
            NetNavActivity(navController)
        }
        composable("StationTempActivity") {
            StationTempActivity(navController)
        }
        composable("NetPollutantsActivity") {
            NetPollutantsActivity(navController)
        }

    }
}

