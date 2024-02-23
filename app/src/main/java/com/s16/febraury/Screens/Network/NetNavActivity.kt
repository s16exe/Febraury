package com.s16.febraury.Screens.Network

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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.s16.febraury.R


@Composable
fun NetNavActivity(navController: NavHostController) {
    Column {
        Image(painter = painterResource(id = R.drawable.mountain), contentDescription =null ,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally

        ) {

        item {


            Text(text = "Station Conditions",
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp,
                color = Color(android.graphics.Color.parseColor("#ffe66d")),
                fontFamily = FontFamily(Font(R.font.regular))
            )
            Spacer(modifier = Modifier.height(80.dp))

            Box(modifier = Modifier.fillMaxWidth(0.95f)
                .clip(RoundedCornerShape(8.dp))){
                Button(
                    onClick = { navController.navigate("StationTempActivity") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp).background(Color(0x70a54c14))
                    ,
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent
                    ),
                    //colors = ButtonColors(
                    //backgroundColor = Color(android.graphics.Color.parseColor("#2196F3"))),
                ) {
                    Text(
                        text = "Temperature",
                        fontSize = 30.sp,
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.regular))
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))
            Box(modifier = Modifier.fillMaxWidth(0.95f)
                .clip(RoundedCornerShape(8.dp))){
                Button(
                    onClick = { navController.navigate("NetPollutantsActivity") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp).background(Color(0x669B48E4))
                    ,
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent
                    ),
                ) {
                    Text(
                        text = "Pollutants",
                        fontSize = 30.sp,
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.regular))
                    )
                }
            }

            Spacer(modifier = Modifier.height(60.dp))

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
                        fontSize = 20.sp,
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.regular))
                    )
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

        }
    }





}