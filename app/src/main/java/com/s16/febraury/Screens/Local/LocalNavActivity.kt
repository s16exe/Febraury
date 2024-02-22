package com.s16.febraury.Screens.Local

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
fun LocalNavActivity(navController: NavHostController) {
    Column {
        Image(painter = painterResource(id = R.drawable.city_mountain), contentDescription =null ,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)
    }


    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,


    ) {
        item {

            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Text(text = "Local Conditions",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#ffea00")))
            }
            Spacer(modifier = Modifier.height(80.dp))

Row (modifier = Modifier
    .fillMaxWidth(),
    horizontalArrangement = Arrangement.Center){
    Box(modifier = Modifier
        .fillMaxWidth(0.95f)
        .clip(RoundedCornerShape(8.dp))){
        Button(
            onClick = { navController.navigate("LocalTempActivity") },
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0x9077a6b6))
            ,
            colors = ButtonDefaults.buttonColors(
                Color.Transparent
            ),
            //colors = ButtonColors(
            //backgroundColor = Color(android.graphics.Color.parseColor("#2196F3"))),
        ) {
            Text(
                text = "Weather",
                fontSize = 30.sp,
                color = Color.White
            )
        }
    }
}


            Spacer(modifier = Modifier.height(50.dp))
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Box(modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .clip(RoundedCornerShape(8.dp))){
                    Button(
                        onClick = { navController.navigate("LocalPollutantsActivity") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(Color(0x50fed0bb))
                        ,
                        colors = ButtonDefaults.buttonColors(
                            Color.Transparent
                        ),
                        //colors = ButtonColors(
                        //backgroundColor = Color(android.graphics.Color.parseColor("#2196F3"))),
                    ) {
                        Text(
                            text = "Pollutants",
                            fontSize = 30.sp,
                            color = Color.White
                        )
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(60.dp))

            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Box(modifier = Modifier
                    .width(250.dp)
                    .padding(16.dp)
                    .clip(RoundedCornerShape(50.dp))) {
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
                            fontSize = 20.sp,
                            color = Color.White

                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
        }


    }





    }