package com.s16.febraury

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.s16.febraury.Screens.*
import com.s16.febraury.Screens.Micro.*
import com.s16.febraury.Screens.Macro.*

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "Login") {
        composable("Login") {
            LoginActivity(navController)
        }
        composable("MicroMacro") {
            MicroMacro(navController)
        }
        composable("MicroNavActivity") {
            MicroNavActivity(navController)
        }

        composable("MicroTempActivity") {
            MicroTempActivity(navController)
        }
        composable("MicroPollutantsActivity") {
            MicroPollutantsActivity(navController)
        }
        composable("MacroNavActivity") {
            MacroNavActivity(navController)
        }
        composable("MacroTempActivity") {
            MacroTempActivity(navController)
        }
        composable("MacroPollutantsActivity") {
            MacroPollutantsActivity(navController)
        }

    }
}

