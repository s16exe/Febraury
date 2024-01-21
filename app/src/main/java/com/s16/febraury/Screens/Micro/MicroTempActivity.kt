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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.s16.febraury.R
import java.nio.file.WatchEvent


@Composable
fun MicroTempActivity(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp)

                .background(MaterialTheme.colorScheme.surface)

        ) {
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(0.dp, 0.dp, 12.dp, 12.dp)),
            ) {

                Image(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(shape = RoundedCornerShape(0.dp, 0.dp, 20.dp, 20.dp)),
                    painter = painterResource(id = R.drawable.sunnycity1),
                    contentDescription = "Weather Background",
                    contentScale = ContentScale.Crop
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(6.dp, 6.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(0.95f)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Row (verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxSize())
                {
                    Text(
                        text = "Wind",
                        color = Color.White,
                        fontSize = 20.sp,
                    )
                    Image(painter = painterResource(id = R.drawable.wind), contentDescription =null,
                        modifier=Modifier.size(30.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "13km/h",
                        color= Color.White,
                        fontSize = 20.sp
                    )

                }


            }

            Box(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(0.95f)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Row(verticalAlignment =Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxSize()) {Text(
                    text = "Humidity",
                    color = Color.White,
                    fontSize = 20.sp,
                )
                    Image(
                        painter = painterResource(id = R.drawable.humidity), contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "72%",
                        fontSize = 20.sp,
                        color = Color.White,
                    )
                }

            }
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(0.95f)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = "Pressure",
                        fontSize = 20.sp,
                        color= Color.White
                    )
                    Image(
                        painter = painterResource(id = R.drawable.pressure),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "15psi",
                        fontSize = 20.sp,
                        color= Color.White
                    )
                }
            }
        }
    }
    @Composable
    fun LinerGradient()
    
}













