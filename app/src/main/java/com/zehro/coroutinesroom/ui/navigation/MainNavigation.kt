package com.zehro.coroutinesroom.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.zehro.coroutinesroom.ui.login_screen.LoginScreen
import com.zehro.coroutinesroom.ui.main_screen.MainScreen
import com.zehro.coroutinesroom.ui.sign_up_screen.SignUpScreen
import com.zehro.coroutinesroom.util.Constants

@Composable
fun MainNavigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Constants.MAIN_SCREEN
    ) {

        // Sign-up Screen
        composable(
            route = Constants.SIGN_UP_SCREEN
        ) {
            SignUpScreen()
        }

        // Login Screen
        composable(
            route = Constants.LOGIN_SCREEN
        ) {
            LoginScreen()
        }

        // Main Screen
        composable(
            route = Constants.MAIN_SCREEN
        ) {
            MainScreen()
        }
    }
}