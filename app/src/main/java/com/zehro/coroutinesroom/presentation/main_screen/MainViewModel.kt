package com.zehro.coroutinesroom.presentation.main_screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.zehro.coroutinesroom.util.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(

): ViewModel() {

    val userDeleted = mutableStateOf(false)
    val signout = mutableStateOf(false)

    fun onSignOut(navController: NavController) {
        // Sign out the user
        // Navigate to Sign Up Screen
        navController.navigate(Constants.SIGN_UP_SCREEN)
    }

    fun onDeleteUser(navController: NavController) {
        // Remove user
        // Navigate to Sign Up Screen
        navController.navigate(Constants.SIGN_UP_SCREEN)
    }
}