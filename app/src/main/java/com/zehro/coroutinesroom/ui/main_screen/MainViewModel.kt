package com.zehro.coroutinesroom.ui.main_screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(

): ViewModel() {

    val userDeleted = mutableStateOf(false)
    val signout = mutableStateOf(false)

    fun onSignOut() {

    }

    fun onDeleteUser() {

    }
}