package com.s16.febraury.Screens.Local


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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


@Composable
fun LocalTempActivity(navController: NavHostController) {



    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Image(modifier = Modifier.fillMaxSize(),
                        painter = painterResource(id = R.drawable.sunnycity1),
            contentDescription = "Weather Background",
            contentScale = ContentScale.Crop
        )

    }












    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(6.dp, 6.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {

        Box(modifier = Modifier.
        fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.DarkGray.copy(alpha = 0.4f))
            )
            {
                Text(
                    text = "25°C",
                    color = Color.White,
                    fontSize = 70.sp,
                    modifier = Modifier


                )

                Text(
                    text = "sunny",
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))


        Column {
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(0.95f)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.DarkGray.copy(alpha = 0.4f))
                    .padding(2.dp),
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
                    ){
                        Text(
                            text = "Wind",
                            color = Color.White,
                            fontSize = 20.sp,
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.25f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ){
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
                    ){
                        Text(
                            text = "13km/h",
                            color = Color.White,
                            fontSize = 20.sp
                        )
                    }


                }

            }

            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier
                    .height(100.dp)
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
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.3f)
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
                            .fillMaxWidth(0.25f)
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
                            text = "72%",
                            fontSize = 20.sp,
                            color = Color.White,
                        )
                    }

                }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(0.95f)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.DarkGray.copy(alpha = 0.4f)),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.3f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Text(
                            text = "Pressure",
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
                            .fillMaxWidth(0.30f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Text(
                            text = "15psi",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }

                }
            }
        }

        Box(
            modifier = Modifier
                .width(250.dp)
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
















