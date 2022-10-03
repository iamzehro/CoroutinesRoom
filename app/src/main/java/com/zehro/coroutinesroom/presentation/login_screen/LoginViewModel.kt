package com.zehro.coroutinesroom.presentation.login_screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.zehro.coroutinesroom.util.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(

): ViewModel() {

    var username = mutableStateOf("Username")
    var password = mutableStateOf("Password")

    val loginComplete = mutableStateOf(false)
    val error = mutableStateOf("")

    fun login(username: String, password: String, navController: NavController) {

        navController.navigate(Constants.MAIN_SCREEN)
    }

    fun signUp(navController: NavController) {
        navController.navigate(Constants.SIGN_UP_SCREEN)
    }
}