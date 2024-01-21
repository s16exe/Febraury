package com.s16.febraury.Screens.Micro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.s16.febraury.R


@Composable
fun MicroNavActivity(navController: NavHostController) {
    Column {
        Image(painter = painterResource(id = R.drawable.city_mountain), contentDescription =null ,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,


    ) {
        Spacer(modifier = Modifier.height(140.dp))
        Text(text = "Current Conditions",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(android.graphics.Color.parseColor("#ffea00")))
        Spacer(modifier = Modifier.height(40.dp))


        Box(modifier = Modifier.fillMaxWidth(0.95f)
            .clip(RoundedCornerShape(8.dp))){
            Button(
                onClick = { navController.navigate("MicroTempActivity") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp).background(Color(0x9077a6b6))
                ,
                colors = ButtonDefaults.buttonColors(
                    Color.Transparent
                ),
                //colors = ButtonColors(
                //backgroundColor = Color(android.graphics.Color.parseColor("#2196F3"))),
            ) {
                Text(
                    text = "Temperature",
                    fontSize = 30.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(50.dp))
        Box(modifier = Modifier.fillMaxWidth(0.95f)
            .clip(RoundedCornerShape(8.dp))){
            Button(
                onClick = { navController.navigate("MicroPollutantsActivity") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp).background(Color(0x50fed0bb))
                ,
                colors = ButtonDefaults.buttonColors(
                    Color.Transparent
                ),
                //colors = ButtonColors(
                //backgroundColor = Color(android.graphics.Color.parseColor("#2196F3"))),
            ) {
                Text(
                    text = "Pollutants",
                    fontSize = 30.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(200.dp))

        Box(modifier = Modifier
            .width(250.dp)
            .padding(16.dp)
            .clip(RoundedCornerShape(50.dp))){
            Button(
                onClick = { navController.popBackStack()},
                modifier = Modifier
                    .width(250.dp)
                    .height(50.dp)
//                    .background(Color(0xFF2a9d8f))
                    .clip(RoundedCornerShape(50.dp)),
                colors = ButtonDefaults.buttonColors(
                    Color.Transparent
                ),
            ) {
                Text(
                    text = "Go Back",
                    fontSize = 20.sp

                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

    }





    }