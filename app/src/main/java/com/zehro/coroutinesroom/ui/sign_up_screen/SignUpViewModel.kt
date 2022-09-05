package com.zehro.coroutinesroom.ui.sign_up_screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(

): ViewModel() {

    val signupComplete = mutableStateOf(false)
    val error = mutableStateOf("")

    fun signup(username: String, password: String) {

    }
}