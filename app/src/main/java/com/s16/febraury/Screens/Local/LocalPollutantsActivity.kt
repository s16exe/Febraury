package com.s16.febraury.Screens.Local

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.s16.febraury.R


@Composable
fun LocalPollutantsActivity(navController: NavHostController) {

    Column {
        Image(
            painter = painterResource(id = R.drawable.pollution), contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
    LazyColumn {
        item {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(
                    text = "POLLUTANTS",
                    color = Color.DarkGray,
                    style = TextStyle(fontSize = 40.sp, fontWeight = FontWeight.Bold)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.65f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth(0.80f)
                            .clip(RoundedCornerShape(30.dp))
                            .background(Color(0x665F4638))
                    )
                    {
                        Column(
                            modifier = Modifier.padding(5.dp, 20.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.SpaceAround,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(70.dp)
                            ) {
                                LazyColumn {
                                    item {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth(0.25f),
                                            contentAlignment = Alignment.Center
                                        ) {

                                            Text(
                                                text = "Carbon Monoxide",
                                                color = Color.White,
                                                style = TextStyle(fontSize = 18.sp)
                                            )
                                        }
                                    }
                                }
                                LazyColumn {
                                    item {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth(0.25f),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(
                                                text = "CO",
                                                color = Color.White,
                                                style = TextStyle(fontSize = 40.sp)
                                            )
                                        }
                                    }
                                }
                                Box(
                                    modifier = Modifier.fillMaxWidth(0.40f),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "40%",
                                        color = Color.White,
                                        style = TextStyle(fontSize = 30.sp)
                                    )
                                }

                            }
                            Row(
                                horizontalArrangement = Arrangement.SpaceAround,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(70.dp)
                            ) {
                                LazyColumn {
                                    item {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth(0.25f),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(
                                                text = "Carbon Dioxide",
                                                color = Color.White,
                                                style = TextStyle(fontSize = 18.sp)
                                            )
                                        }
                                    }
                                }
                                LazyColumn {
                                    item {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth(0.27f),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(
                                                text = "CO₂",
                                                color = Color.White,
                                                style = TextStyle(fontSize = 35.sp)
                                            )
                                        }
                                    }
                                }
                                Box(
                                    modifier = Modifier.fillMaxWidth(0.40f),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "18%",
                                        color = Color.White,
                                        style = TextStyle(fontSize = 30.sp)
                                    )
                                }
                            }
                            Row(
                                horizontalArrangement = Arrangement.SpaceAround,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(70.dp)
                            ) {
                                LazyColumn {
                                    item {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth(0.25f),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(
                                                text = "Methane",
                                                color = Color.White,
                                                style = TextStyle(fontSize = 18.sp)
                                            )
                                        }
                                    }
                                }
                                LazyColumn {
                                    item {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth(0.40f),
                                            contentAlignment = Alignment.Center
                                        ) {

                                            Text(
                                                text = "CH₄",
                                                color = Color.White,
                                                style = TextStyle(fontSize = 40.sp)
                                            )
                                        }
                                    }
                                }
                                Box(
                                    modifier = Modifier.fillMaxWidth(0.40f),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "6%",
                                        color = Color.White,
                                        style = TextStyle(fontSize = 30.sp)
                                    )
                                }
                            }
                            Row(
                                horizontalArrangement = Arrangement.SpaceAround,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(70.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth(0.25f),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "Sulphur Dioxide",
                                        color = Color.White,
                                        style = TextStyle(fontSize = 18.sp)
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth(0.40f),
                                    contentAlignment = Alignment.Center
                                ) {

                                    Text(
                                        text = "SO₂",
                                        color = Color.White,
                                        style = TextStyle(fontSize = 40.sp)
                                    )
                                }
                                Box(
                                    modifier = Modifier.fillMaxWidth(0.40f),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "40%",
                                        color = Color.White,
                                        style = TextStyle(fontSize = 27.sp)
                                    )
                                }
                            }
                            Row(
                                horizontalArrangement = Arrangement.SpaceAround,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(70.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth(0.25f),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "Nitric Oxide",
                                        color = Color.White,
                                        style = TextStyle(fontSize = 18.sp)
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth(0.40f),
                                    contentAlignment = Alignment.Center
                                ) {

                                    Text(
                                        text = "NO",
                                        color = Color.White,
                                        style = TextStyle(fontSize = 40.sp)
                                    )
                                }
                                Box(
                                    modifier = Modifier.fillMaxWidth(0.40f),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "9%",
                                        color = Color.White,
                                        style = TextStyle(fontSize = 27.sp)
                                    )
                                }
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.80f)
                        .clip(RoundedCornerShape(30.dp))
                        .background(Color(0x665F4638))
                )
                {
                    Row(
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth(0.98f)
                            .height(150.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceAround
                        ) {
                            Box(modifier = Modifier.fillMaxHeight(0.10f))
                            Box(modifier = Modifier
                                .fillMaxWidth(0.27f)
                                .fillMaxHeight(0.40f)) {
                                Text(
                                    text = "Particulate Matter",
                                    color = Color.White,
                                    style = TextStyle(fontSize = 18.sp)
                                )
                            }
                            Box(modifier = Modifier.fillMaxHeight(0.10f))

                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Box(modifier = Modifier
                                .fillMaxWidth(0.30f)
                                .fillMaxHeight(0.50f)) {
                                Text(
                                    text = "PM2.5",
                                    color = Color.White,
                                    style = TextStyle(fontSize = 20.sp)
                                )
                            }
                            Box(modifier = Modifier
                                .fillMaxWidth(0.30f)
                                .fillMaxHeight(0.50f)) {
                                Text(
                                    text = "PM10",
                                    color = Color.White,
                                    style = TextStyle(fontSize = 20.sp)
                                )
                            }
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceAround
                        ) {
                            Box(modifier = Modifier
                                .fillMaxWidth(0.30f)
                                .fillMaxHeight(0.50f)) {
                                Text(
                                    text = "15%",
                                    color = Color.White,
                                    style = TextStyle(fontSize = 20.sp)
                                )
                            }
                            Box(modifier = Modifier
                                .fillMaxWidth(0.30f)
                                .fillMaxHeight(0.50f)) {
                                Text(
                                    text = "25%",
                                    color = Color.White,
                                    style = TextStyle(fontSize = 20.sp)
                                )
                            }
                        }
                    }
                }
            }

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    modifier = Modifier
                        .width(250.dp)
                        .padding(16.dp)
                        .clip(RoundedCornerShape(50.dp)),
                    contentAlignment = Alignment.Center
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
}































