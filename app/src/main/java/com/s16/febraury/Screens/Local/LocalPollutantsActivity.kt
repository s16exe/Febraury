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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry
import androidx.navigation.NavHostController
import com.s16.febraury.R


@Composable
fun LocalPollutantsActivity(navController: NavHostController) {

    Column {
        Image(
            painter = painterResource(id = R.drawable.background11), contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
    Spacer(modifier = Modifier.height(10.dp))




    LazyColumn {
        item {
            Spacer(modifier = Modifier.height(25.dp))


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "POLLUTANTS",
            color = Color.White,
            style = TextStyle(fontSize = 40.sp, fontWeight = FontWeight.Bold),
            fontFamily = FontFamily(Font(R.font.regular))
        )
        Spacer(modifier = Modifier.height(8.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.60f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth(0.90f)
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color(0x4D6B635F))
            )
            {
                Column(
                    modifier = Modifier.padding(5.dp, 20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Detail(text = "Carbon Monoxide", textResId = R.drawable.cowbg, value = "421ppm")
                    Detail(text = "Carbon Dioxide", textResId = R.drawable.co2wbg, value = "421ppm")
                    Detail(text = "Methane", textResId = R.drawable.ch4wbg, value = "1000ppm")
                    Detail(text = "Sulphur Dioxide", textResId = R.drawable.so2wbg, value = "1.05ppm")
                    Detail(text = "Nitric Oxide", textResId = R.drawable.nowbg, value = "0.05ppm")


                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth(0.90f)
                .clip(RoundedCornerShape(30.dp))
                .background(Color(0x996B635F))
        )
        {
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth(0.98f)
                    .height(160.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth(0.25f)
                        .fillMaxHeight()
                ) {

                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Particulate Matter",
                            color = Color.White,
                            style = TextStyle(fontSize = 14.sp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily(Font(R.font.regular))
                        )
                    }

                }


                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth(0.3f)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.
                        fillMaxHeight(0.5f)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.pm25),
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(Color.White)
                        )
                    }
                    Box(
                        contentAlignment = Alignment.Center,

                        ) {
                        Image(
                            painter = painterResource(id = R.drawable.pm10),
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(Color.White)
                        )
                    }
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(0.45f)
                ) {

                    Text(
                        text = "45µg/m³",
                        color = Color.White,
                        style = TextStyle(fontSize = 16.sp),
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily(Font(R.font.regular))
                    )


                    Text(
                        text = "84µg/m³",
                        color = Color.White,
                        style = TextStyle(fontSize = 16.sp),
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily(Font(R.font.regular))
                    )

                }

            }
        }
    }
    Spacer(modifier = Modifier.height(25.dp))


            Box(
                modifier = Modifier
                    .fillMaxWidth()
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
                        fontSize = 20.sp,
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.regular))
                    )
                }
            }



        }
    }
}













@Composable
fun Detail(text: String,textResId: Int, value: String){
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
    ) {
        LazyColumn {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.25f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = text,
                        color = Color.White,
                        style = TextStyle(fontSize = 15.sp),
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily(Font(R.font.regular))
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.30f),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(id = textResId),
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.White)
            )
        }

        Box(
            modifier = Modifier.fillMaxWidth(0.45f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = value,
                color = Color.White,
                style = TextStyle(fontSize = 16.sp),
                fontFamily = FontFamily(Font(R.font.regular))
            )
        }
    }
}
