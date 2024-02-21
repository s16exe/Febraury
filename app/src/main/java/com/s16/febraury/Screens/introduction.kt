package com.s16.febraury.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.s16.febraury.R

@Composable
fun Introduction(navController: NavHostController) {

    Image(
        painter = painterResource(id = R.drawable.introclouds),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxSize()
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            ,
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logof),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(250.dp)
        )

        Button(
            onClick = { navController.navigate("LocalNetwork") },
            modifier = Modifier
                .width(250.dp)
                .height(70.dp)
                .clip(RoundedCornerShape(30.dp)),
            colors = ButtonDefaults.buttonColors(
                Color(android.graphics.Color.parseColor("#9900afb9"))
            ),
        ) {
            Text(
                text = "Get Started",
                fontSize = 30.sp,
                color = Color.Black
            )
        }

        Box(modifier = Modifier.fillMaxWidth(0.8f)){
            Text(
                text = "*A project centered around students, aimed at studying climate change by deploying a network of micro-weather and pollution monitoring stations. Sponsored by IEEE HTC.",
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
                fontSize = 13.sp,
            )
        }

    }
}



