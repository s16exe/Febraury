package com.s16.febraury.Screens.Network

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.s16.febraury.R

data class School(val name: String, val destination: String)

@Composable
fun NetListActivity(navController: NavHostController) {
    val schoolList = listOf(
        School(name = "Jawahar Navodaya Vidyalaya, Bagalur", destination = "NetNavActivity"),
        School(name = "Parikrma School, Sahakara Nagar", destination = "NetNavActivity"),
        School(name = "Army Public School, JC Nagar", destination = "NetNavActivity"),
        School(name = "Bishop Cotton Boys' School, Residency Road", destination = "NetNavActivity"),
        School(name = "Baldwin Boys' High School, Richmond Town", destination = "NetNavActivity"),
        School(name = "Delhi Public School, North", destination = "NetNavActivity"),
        School(name = "Inventure Academy, Whitefield", destination = "NetNavActivity"),
        School(name = "Vidya Niketan School, Hebbal", destination = "NetNavActivity"),
        School(name = "St. Joseph's Boys' High School, Museum Road", destination = "NetNavActivity"),
        School(name = "Mallya Aditi International School, Yelahanka", destination = "NetNavActivity"),
        School(name = "Ryan International School, Kundalahalli", destination = "NetNavActivity"),
        School(name = "The International School Bangalore (TISB), Domlur", destination = "NetNavActivity")
        // Add more schools as needed
    )

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
            Text(text = "List Of Stations",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#ffea00")),fontFamily = FontFamily(
                    Font(R.font.regular)
                ))
            Spacer(modifier = Modifier.height(40.dp))
        }

        items(schoolList) { school ->
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .clip(RoundedCornerShape(16.dp))
                    .clickable { navController.navigate(school.destination) }
            ) {
                Button(
                    onClick = { navController.navigate(school.destination) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent
                    ),
                ) {
                    Text(
                        text = school.name,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 40.sp,
                            fontFamily = FontFamily(Font(R.font.regular))// Adjust as needed for your font size
                        ),
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .padding(16.dp)
                    .clip(RoundedCornerShape(50.dp)),
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
                        fontSize = 20.sp,
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.regular))
                    )
                }
            }
        }
    }
}
