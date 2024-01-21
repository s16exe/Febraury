package com.s16.febraury.Screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import com.s16.febraury.R
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle


@Composable
fun LoginActivity(navController: NavHostController) {
    var phone by remember { mutableStateOf("") }


    var isButtonEnabled by remember {
        mutableStateOf(false)
    }



    Box(modifier = Modifier.fillMaxSize(),
        Alignment.Center){


        Image(painter = painterResource(id = R.drawable.login_back), contentDescription =null ,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(40.dp)
                .padding(0.dp, 0.dp, 0.dp, 40.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            OutlinedTextField(
                value = phone,
                onValueChange = {
                    phone = it
                    isButtonEnabled = phone.isNotEmpty()
                },
                label = { Text(text = "Phone",
                    color = Color.White)},
                singleLine = true,
                leadingIcon = {
                    Icon(
                        Icons.Rounded.Phone,
                        contentDescription = stringResource(id = R.string.desc)
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                ),)

            // Login Button
            Button(
                onClick = {
                    // Handle login logic here
                          navController.navigate("MicroMacro")
                },
                enabled = isButtonEnabled
            ) {
                Text("Login")
            }
        }
    }
}