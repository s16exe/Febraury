package com.s16.febraury

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.s16.febraury.Screens.*
import com.s16.febraury.Screens.Local.*
import com.s16.febraury.Screens.Network.*
import kotlin.random.Random

@Composable
fun MyApp() {
    val navController = rememberNavController()
    val currentWeather = determineWeatherCondition()

    NavHost(navController, startDestination = "Introduction") {
        composable("LocalNetwork") {
            LocalNetwork(navController)
        }
        composable("LocalNavActivity") {
            LocalNavActivity(navController)
        }

        composable("LocalTempActivity") {

            val backgroundResource = when (currentWeather) {
                is WeatherCondition.Sunny -> R.drawable.sunnycity1
                is WeatherCondition.Clear -> R.drawable.clear
                is WeatherCondition.Rainy -> R.drawable.rain1
                is WeatherCondition.Storm -> R.drawable.heavyrain
                is WeatherCondition.Snowy -> R.drawable.snowy1
            }

            LocalTempActivity(navController,currentWeather,backgroundResource)
        }
        composable("StationTempActivity") {

            val backgroundResource = when (currentWeather) {
                is WeatherCondition.Sunny -> R.drawable.sunnycity1
                is WeatherCondition.Clear -> R.drawable.clear
                is WeatherCondition.Rainy -> R.drawable.rain1
                is WeatherCondition.Storm -> R.drawable.heavyrain
                is WeatherCondition.Snowy -> R.drawable.snowy1
            }

            LocalTempActivity(navController,currentWeather,backgroundResource)
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
//        composable("StationTempActivity") {
//            StationTempActivity(navController)
//        }
        composable("NetPollutantsActivity") {
            NetPollutantsActivity(navController)
        }
        composable("Introduction") {
            Introduction(navController)
        }

    }
}

fun determineWeatherCondition(): WeatherCondition {
    val randomWeatherCondition = when (Random.nextInt(5)) {
        0 -> WeatherCondition.Sunny
        1 -> WeatherCondition.Clear
        2 -> WeatherCondition.Rainy
        3 -> WeatherCondition.Storm
        4 -> WeatherCondition.Snowy
        else -> WeatherCondition.Clear // Default condition
    }
    return randomWeatherCondition
}




