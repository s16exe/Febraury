package com.s16.febraury

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.s16.febraury.ui.theme.FebrauryTheme
import kotlinx.coroutines.delay

@SuppressLint("CustomSplashScreen")
class SplashActivity :ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FebrauryTheme {
                SplashScreen()
            }
        }

    }

    @Composable
    private fun SplashScreen(){
        val alpha = remember {
            Animatable(0f)
        }
        LaunchedEffect(key1 = true) {
            alpha.animateTo(1f, animationSpec = tween(1200))
            delay(1500)
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
            finish()
        }
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1c90f2)),
            contentAlignment = Alignment.Center){

            Image(modifier = Modifier.alpha(alpha.value),
                painter = painterResource(id = R.drawable.weather_logo), contentDescription = null)

        }
    }
}