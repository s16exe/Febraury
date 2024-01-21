package com.s16.febraury.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
fun MicroMacro(navController: NavHostController) {
    Column {
        Image(painter = painterResource(id = R.drawable.all_pic), contentDescription =null ,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)
    }


    Row(
        modifier = Modifier
            .fillMaxSize(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Center
    ) {

    }

    Spacer(modifier = Modifier.height(16.dp))

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,


    ) {
        Spacer(modifier = Modifier.height(180.dp))
        Box(modifier = Modifier
            .fillMaxWidth(0.95f)
            .clip(RoundedCornerShape(16.dp))){
            Button(
                onClick = { navController.navigate("MicroNavActivity") },
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
                    text = "MICRO",
                    fontSize = 30.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(40.dp))
        Box(modifier = Modifier
            .fillMaxWidth(0.95f)
            .clip(RoundedCornerShape(16.dp))){
            Button(
                onClick = { navController.navigate("MacroNavActivity") },
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
                    text = "MACRO",
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
//                    .background()
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


    }



}