package com.zehro.coroutinesroom.presentation.main_screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun MainScreen(
    username: String = "< Unknown User >",
    navController: NavController,
    viewModel: MainViewModel = hiltViewModel()
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "You are now signed in as...")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = username)
        Spacer(modifier = Modifier.height(40.dp))
        Row() {
            Button(onClick = { viewModel.onSignOut(navController) }) {
                Text(text = "Sign Out")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                onClick = { viewModel.onDeleteUser(navController) }
            ) {
                Text(text = "Delete User")
            }
        }
    }
}