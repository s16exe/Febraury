package com.s16.febraury

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.material3.LocalContentColor // Updated import
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.res.painterResource
import com.s16.febraury.R


@Composable
fun NavigationActivity1(navController: NavHostController) {
    val backgroundColor = Color(android.graphics.Color.parseColor("#FF5722"))
    Row(
        modifier = Modifier
            .fillMaxSize(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.my_logo), // Replace with your actual resource ID
            contentDescription = null, // Provide a content description if needed
            modifier = Modifier
                .width(250.dp)
                .height(200.dp)

        )



    }



    Spacer(modifier = Modifier.height(16.dp))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .offset(0.dp, 150.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Text(text = "Global Conditions", fontSize = 30.sp )
        Spacer(modifier = Modifier.height(40.dp))
        Button(
            onClick = { navController.navigate("G")},
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            shape = RoundedCornerShape(8.dp),
            //colors = ButtonColors(
            //backgroundColor = Color(android.graphics.Color.parseColor("#FF5722"))),
        ) {
            Text(
                text = "Temperature",
                fontSize = 40.sp
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate("H")},
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            shape = RoundedCornerShape(8.dp),
            //colors = ButtonColors(
            //backgroundColor = Color(android.graphics.Color.parseColor("#2196F3"))),
        ) {
            Text(
                text = "Pollutants",
                fontSize = 40.sp
            )
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            onClick = { navController.popBackStack()},
            modifier = Modifier
                .width(250.dp)
                .height(50.dp),
            shape = RoundedCornerShape(30.dp),
            //colors = ButtonColors(
            //backgroundColor = Color(android.graphics.Color.parseColor("#4CAF50"))),
        ) {
            Text(
                text = "Go Back",
                fontSize = 30.sp

            )
        }
        Spacer(modifier = Modifier.height(16.dp))

    }



}