package com.zehro.coroutinesroom.presentation.login_screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    navController: NavController,
    viewModel: LoginViewModel = hiltViewModel()
) {
    var username: String = ""
    var password: String = ""

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = viewModel.username.value,
            onValueChange = {
                viewModel.username.value = it
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = viewModel.password.value,
            onValueChange = { pass ->
                viewModel.password.value = pass
            }
        )
        Spacer(modifier = Modifier.height(40.dp))
        Row() {
            Button(onClick = { viewModel.login(username, password, navController) }) {
                Text(text = "Login")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(onClick = { viewModel.signUp(navController) }) {
                Text(text = "Go To Sign Up")
            }
        }
    }
}