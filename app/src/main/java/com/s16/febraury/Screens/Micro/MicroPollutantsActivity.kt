package com.s16.febraury.Screens.Micro

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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.s16.febraury.R


@Composable
fun MicroPollutantsActivity(navController: NavHostController) {

    Column {
        Image(
            painter = painterResource(id = R.drawable.pollution), contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {

        Text(
            text = "AIR ",
            color = Color.White,
            style = TextStyle(fontSize = 45.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(30.dp,0.dp)
        )
        Text(
            text = "TOXICITY ",
            color = Color.White,
            style = TextStyle(fontSize = 45.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(30.dp,0.dp)
        )



        Spacer(modifier = Modifier.height(50.dp))
        Box(modifier = Modifier
            .fillMaxWidth(0.99f)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0x66525353))) {


        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
        ) {
            Box (modifier = Modifier
                .height(70.dp)
                .width(140.dp)
                .padding(0.dp, 18.dp)){

                Text(
                    text = "Carbon Monoxide",
                    color = Color.White,
                    style = TextStyle(fontSize = 20.sp)
                )}
            Box (modifier = Modifier
                .height(70.dp)
                .width(80.dp)) {
                Text(
                    text = "CO",
                    color = Color.White,
                    style = TextStyle(fontSize = 40.sp)
                )
            }
            Box(modifier = Modifier.height(70.dp).width(80.dp))
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Box(modifier = Modifier
            .fillMaxWidth(0.99f)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0x66525353))) {
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
            ) {
                Box (modifier = Modifier
                    .height(70.dp)
                    .width(140.dp)
                    .padding(0.dp, 18.dp)){
                Text(
                    text = "Carbon Dioxide",
                    color = Color.White,
                    style = TextStyle(fontSize = 20.sp)
                )}
                Box (modifier = Modifier
                    .height(70.dp)
                    .width(80.dp)){
                    Text(
                    text = "CO₂",
                    color = Color.White,
                    style = TextStyle(fontSize = 40.sp)
                )}
                Box(modifier = Modifier.height(70.dp).width(80.dp))
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Box(modifier = Modifier
            .fillMaxWidth(0.99f)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0x66525353))) {

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
            ) {
                Box (modifier = Modifier
                    .height(70.dp)
                    .width(140.dp)
                    .padding(0.dp, 18.dp)){
                Text(
                    text = "Methane",
                    color = Color.White,
                    style = TextStyle(fontSize = 20.sp)
                )}
                Box (modifier = Modifier
                    .height(70.dp)
                    .width(80.dp)){

                Text(
                    text = "CH₄",
                    color = Color.White,
                    style = TextStyle(fontSize = 40.sp)
                )}
                Box(modifier = Modifier.height(70.dp).width(80.dp))
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Box(modifier = Modifier
            .fillMaxWidth(0.99f)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0x66525353))) {
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
            ) {Box (modifier = Modifier
                .height(70.dp)
                .width(140.dp)
                .padding(0.dp, 18.dp)){
                Text(
                    text = "Dust Hazard",
                    color = Color.White,
                    style = TextStyle(fontSize = 20.sp)
                )}
                Box (modifier = Modifier
                    .height(70.dp)
                    .width(80.dp)){

                Image(
                    painter = painterResource(id = R.drawable.maskman),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )}
                Box(modifier = Modifier.height(70.dp).width(80.dp))
            }
        }
        Row (modifier = Modifier.padding(80.dp,0.dp)){
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .padding(16.dp)
                    .clip(RoundedCornerShape(50.dp))
            ) {
                Button(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier
                        .width(200.dp)
                        .height(50.dp)
//                    .background(Color(0xFF2a9d8f))
                        .clip(RoundedCornerShape(50.dp)),
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent
                    )
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








