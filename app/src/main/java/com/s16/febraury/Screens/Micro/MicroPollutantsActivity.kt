package com.s16.febraury.Screens.Micro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
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
    Box(modifier = Modifier.background(Color(0x33FAF5F2)).fillMaxSize(4f)) {
        Box (modifier = Modifier.fillMaxSize()){
            Image(painter = painterResource(id = R.drawable.polllbg), contentDescription =  null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .matchParentSize()
                    .blur(40.dp))
            Box(modifier = Modifier.background(Color(0x33FAF5F2))) {
                Column(
                    horizontalAlignment = AbsoluteAlignment.Left,
                    modifier = Modifier.padding(20.dp)
                ) {
                    Text(
                        text = "AIR ",
                        color = Color.White,
                        style = TextStyle(fontSize = 45.sp, fontWeight = FontWeight.Bold)
                    )
                    Text(
                        text = "TOXICITY ",
                        color = Color.White,
                        style = TextStyle(fontSize = 45.sp, fontWeight = FontWeight.Bold)
                    )
                    Row {
                        Text(
                            text = "Carbon",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp), modifier = Modifier.offset(5.dp, 30.dp)
                        )
                        Text(
                            text = "Monoxide",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp),
                            modifier = Modifier.offset(-45.dp, 60.dp)
                        )
                        Text(
                            text = "CO",
                            color = Color.White,
                            style = TextStyle(fontSize = 40.sp), modifier = Modifier.offset(5.dp, 30.dp)
                        )
                    }
                    Row {
                        Text(
                            text = "Carbon",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp), modifier = Modifier.offset(5.dp, 70.dp)
                        )
                        Text(
                            text = "Dioxide",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp),
                            modifier = Modifier.offset(-45.dp, 103.dp)
                        )
                        Text(
                            text = "CO₂",
                            color = Color.White,
                            style = TextStyle(fontSize = 40.sp),
                            modifier = Modifier.offset(24.dp, 70.dp)
                        )
                    }
                    Row {
                        Text(
                            text = "Methane",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp),
                            modifier = Modifier.offset(5.dp, 130.dp)
                        )
                        Spacer(modifier = Modifier.width(73.dp))
                        Text(
                            text = "CH₄",
                            color = Color.White,
                            style = TextStyle(fontSize = 40.sp),
                            modifier = Modifier.offset(-9.dp, 120.dp)
                        )
                    }
                    Row {
                        Text(
                            text = "Dust",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp),
                            modifier = Modifier.offset(5.dp, 170.dp)
                        )
                        Text(
                            text = "Hazard",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp),
                            modifier = Modifier.offset(-28.dp, 200.dp)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.maskman),
                            contentDescription = null,
                            modifier = Modifier
                                .offset(50.dp, 170.dp)
                                .size(45.dp)
                        )
                    }
                    Button(
                        onClick = { navController.popBackStack() }, modifier = Modifier
                            .size(80.dp)
                            .offset(230.dp, 250.dp)
                    )

                    {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                            contentDescription = null, modifier = Modifier.size(80.dp)
                        )
                    }


                }
            }
        }

    }
}
