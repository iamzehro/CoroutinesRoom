package com.zehro.coroutinesroom.ui.main_screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MainScreen(
    username: String = "unknown user",
    viewModel: MainViewModel = hiltViewModel()
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "You are now signed in as...")
        Text(text = username)
        Spacer(modifier = Modifier.height(20.dp))
        Row() {
            Button(onClick = { viewModel.onSignOut() }) {
                Text(text = "Sign Out")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                onClick = { viewModel.onDeleteUser() }
            ) {
                Text(text = "Delete User")
            }
        }

    }
}