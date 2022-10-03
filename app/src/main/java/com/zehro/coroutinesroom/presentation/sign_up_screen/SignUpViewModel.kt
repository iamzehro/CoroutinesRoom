package com.zehro.coroutinesroom.presentation.sign_up_screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.zehro.coroutinesroom.util.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(

): ViewModel() {

    var username = mutableStateOf("Username")
    var password = mutableStateOf("Password")
    var info = mutableStateOf("Info")

    val signupComplete = mutableStateOf(false)
    val error = mutableStateOf("")

    fun signup(navController: NavController) {
        // Update database with User, Pass and Info
        // Then navigate to main screen
        navController.navigate(Constants.MAIN_SCREEN)
    }

    fun login(navController: NavController) {
        navController.navigate(Constants.LOGIN_SCREEN)
    }

    fun updateUsername(user: String) {
        username.value = user
    }

    fun updatePassword(pass: String) {
        password.value = pass
    }

    fun updateInfo(msg: String) {
        info.value = msg
    }
}