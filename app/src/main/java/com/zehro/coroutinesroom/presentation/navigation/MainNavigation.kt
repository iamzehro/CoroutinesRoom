package com.zehro.coroutinesroom.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.zehro.coroutinesroom.presentation.login_screen.LoginScreen
import com.zehro.coroutinesroom.presentation.main_screen.MainScreen
import com.zehro.coroutinesroom.presentation.sign_up_screen.SignUpScreen
import com.zehro.coroutinesroom.util.Constants

@Composable
fun MainNavigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Constants.SIGN_UP_SCREEN
    ) {

        // Sign-up Screen
        composable(
            route = Constants.SIGN_UP_SCREEN
        ) {
            SignUpScreen(navController = navController)
        }

        // Login Screen
        composable(
            route = Constants.LOGIN_SCREEN
        ) {
            LoginScreen(navController = navController)
        }

        // Main Screen
        composable(
            route = Constants.MAIN_SCREEN
        ) {
            MainScreen(navController = navController)
        }
    }
}