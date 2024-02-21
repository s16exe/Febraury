package com.s16.febraury.Screens.Network

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.s16.febraury.R

@Composable
fun NetCityActivity(navController: NavHostController) {

    Column {
        Image(
            painter = painterResource(id = R.drawable.all_pic), contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        item {
            Spacer(modifier = Modifier.height(100.dp))
            Text(text = "List Of Cities",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#ffea00")))
            Spacer(modifier = Modifier.height(40.dp))
        }
        items(cityList) { city ->
            CityButton(cityName = city, onClick = { navController.navigate("NetListActivity") })
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .padding(16.dp)
                    .clip(RoundedCornerShape(50.dp))
            ) {
                Button(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
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
}

@Composable
fun CityButton(cityName: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.95f)
            .clip(RoundedCornerShape(16.dp))
    ) {
        Button(
            onClick = onClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0x906d597a)),
            colors = ButtonDefaults.buttonColors(
                Color.Transparent
            ),
        ) {
            Text(
                text = cityName,
                fontSize = 30.sp
            )
        }
    }
}

val cityList = listOf(
    "BENGALURU",
    "MUMBAI",
    "DELHI",
    "CHENNAI",
    "HYDERABAD",
    "KOLKATA",
    "PUNE",
    "AHMEDABAD",
    "COIMBATORE"
)
