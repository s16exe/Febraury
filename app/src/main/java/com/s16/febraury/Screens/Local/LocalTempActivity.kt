package com.s16.febraury.Screens.Local

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.s16.febraury.R

sealed class WeatherCondition {
    object Sunny : WeatherCondition()
    object Clear : WeatherCondition()
    object Rainy : WeatherCondition()
    object Storm : WeatherCondition()
    object Snowy : WeatherCondition()
}
@Composable
fun LocalTempActivity(
    navController: NavHostController,
    currentWeather: WeatherCondition,
    backgroundResource: Int
)
{
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = backgroundResource),
            contentDescription = "Weather Background",
            contentScale = ContentScale.Crop
        )
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        item {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .background(Color.DarkGray.copy(alpha = 0.4f))
                        .padding(6.dp),
                    contentAlignment = Alignment.TopCenter
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    )
                    {
                        Text(
                            text = "25°C",
                            color = Color.White,
                            fontSize = 70.sp,
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = when (currentWeather) {
                                is WeatherCondition.Sunny -> "Sunny"
                                is WeatherCondition.Clear -> "Clear"
                                is WeatherCondition.Rainy -> "Rainy"
                                is WeatherCondition.Storm -> "Stormy"
                                is WeatherCondition.Snowy -> "Snowy"
                            },
                            color = Color.White,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.SansSerif,
                        )
                    }
                }
            }

        }



        item {
            Spacer(modifier = Modifier.height(40.dp))
            Box(
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth(0.95f)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.DarkGray.copy(alpha = 0.4f))
                    .padding(2.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxSize()
                )
                {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.3f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Wind Speed",
                            color = Color.White,
                            fontSize = 20.sp,
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.25f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.wind),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp),
                            colorFilter = ColorFilter.tint(Color.White)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.40f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "6 km/h",
                            color = Color.White,
                            fontSize = 20.sp
                        )
                    }
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth(0.95f)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.DarkGray.copy(alpha = 0.4f))
                    .padding(2.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxSize()
                )
                {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.3f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Wind Direction",
                            color = Color.White,
                            fontSize = 20.sp,
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.25f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.wind_direction),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp),
                            colorFilter = ColorFilter.tint(Color.White)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.40f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "NE",
                            color = Color.White,
                            fontSize = 20.sp
                        )
                    }
                }
            }
        }


        item {
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth(0.95f)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.DarkGray.copy(alpha = 0.4f))
                    .padding(2.dp),
                contentAlignment = Alignment.Center
            )
            {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.22f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Text(
                            text = "Humidity",
                            color = Color.White,
                            fontSize = 20.sp,
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.45f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.humidity),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp),
                            colorFilter = ColorFilter.tint(Color.White)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.30f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Text(
                            text = "33%",
                            fontSize = 20.sp,
                            color = Color.White,
                        )
                    }
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth(0.95f)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.DarkGray.copy(alpha = 0.4f)),
            )
            {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.31f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Text(
                            text = "Atmospheric Pressure",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.25f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.pressure),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp),
                            colorFilter = ColorFilter.tint(Color.White)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.38f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Text(
                            text = "923 hPa",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }

                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth(0.95f)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.DarkGray.copy(alpha = 0.4f))
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(0.25f),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Rainfall",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(0.40f),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.rainfall2),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp),
                            colorFilter = ColorFilter.tint(Color.White)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.30f)
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "0 mm",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }

        item {
            Spacer(modifier = Modifier.absolutePadding(bottom = 60.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth(.5f)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(50.dp))

            ) {
                Button(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier
                        .width(250.dp)
                        .height(50.dp)
                        .background(color = Color.DarkGray.copy(alpha = 0.7f))
                        .clip(RoundedCornerShape(50.dp)),
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                ) {
                    Text(
                        text = "Go Back",
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}