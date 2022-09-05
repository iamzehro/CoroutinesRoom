package com.zehro.coroutinesroom.ui.login_screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(

): ViewModel() {

    val loginComplete = mutableStateOf(false)
    val error = mutableStateOf("")

    fun login(username: String, password: String) {

    }
}