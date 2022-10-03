package com.zehro.coroutinesroom.presentation.sign_up_screen

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
fun SignUpScreen(
    navController: NavController,
    viewModel: SignUpViewModel = hiltViewModel()
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = viewModel.username.value,
            onValueChange = {
                viewModel.updateUsername(it)
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = viewModel.password.value,
            onValueChange = {
                viewModel.updatePassword(it)
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = viewModel.info.value,
            onValueChange = {
                viewModel.updateInfo(it)
            }
        )
        Spacer(modifier = Modifier.height(40.dp))
        Row() {
            Button(onClick = { viewModel.signup(navController) }) {
                Text(text = "Sign Up")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(onClick = { viewModel.login(navController) }) {
                Text(text = "Go To Login")
            }
        }
    }
}