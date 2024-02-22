package com.s16.febraury.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.s16.febraury.R


@Composable
fun LocalNetwork(navController: NavHostController) {
    Column {
        Image(painter = painterResource(id = R.drawable.all_pic), contentDescription =null ,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)
    }


    Spacer(modifier = Modifier.height(16.dp))

    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center,


    ) {
        item {

            
            Spacer(modifier = Modifier.height(100.dp))
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                Box(modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .clip(RoundedCornerShape(16.dp))){
                    Button(
                        onClick = { navController.navigate("LocalNavActivity") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(Color(0x906d597a))
                        ,
                        colors = ButtonDefaults.buttonColors(
                            Color.Transparent
                        ),
                        //colors = ButtonColors(
                        //backgroundColor = Color(android.graphics.Color.parseColor("#2196F3"))),
                    ) {
                        Text(
                            text = "LOCAL",
                            fontSize = 30.sp,
                            color = Color.White
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(40.dp))
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Box(modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .clip(RoundedCornerShape(16.dp))){
                    Button(
                        onClick = { navController.navigate("NetCityActivity") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(Color(0x90355070))
                        ,
                        colors = ButtonDefaults.buttonColors(
                            Color.Transparent
                        ),
                        //colors = ButtonColors(
                        //backgroundColor = Color(android.graphics.Color.parseColor("#2196F3"))),
                    ) {
                        Text(
                            text = "NETWORK",
                            fontSize = 30.sp,
                            color = Color.White
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(90.dp))

            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Box(modifier = Modifier
                    .width(250.dp)
                    .padding(16.dp)
                    .clip(RoundedCornerShape(50.dp))){
                    Button(
                        onClick = { navController.popBackStack()},
                        modifier = Modifier
                            .width(250.dp)
                            .height(50.dp)
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
        }


    }



}