package com.zehro.coroutinesroom.ui.sign_up_screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun SignUpScreen(
    viewModel: SignUpViewModel = hiltViewModel()
) {
    var username: String = ""
    var password: String = ""

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = "signUpUsername",
            onValueChange = {
                username = it
            }
        )
        TextField(
            value = "signUpPassword",
            onValueChange = {
                password = it
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row() {
            Button(onClick = { viewModel.signup(username, password) }) {
                Text(text = "Sign Up")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Login")
            }
        }

    }
    
}