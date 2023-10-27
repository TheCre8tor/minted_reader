package com.alexander.mintedreader.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alexander.mintedreader.screens.ReaderSplashScreen
import com.alexander.mintedreader.screens.details.BookDetailsScreen
import com.alexander.mintedreader.screens.home.ReaderHomeScreen
import com.alexander.mintedreader.screens.login.ReaderLoginScreen
import com.alexander.mintedreader.screens.search.ReaderBookSearchScreen
import com.alexander.mintedreader.screens.stats.ReaderStatsScreen
import com.alexander.mintedreader.screens.update.BookUpdateScreen

@Composable
fun ReaderNavigation() {
    // Plugin: hilt-navigation-compose
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = ReaderScreens.SplashScreen.name
    ) {
        composable(ReaderScreens.SplashScreen.name) {
            // By passing a navController to a screen,
            // user can use the controller instance to navigate
            // to another screen.
            ReaderSplashScreen(navController = navController)
        }

        composable(ReaderScreens.LoginScreen.name) {
            ReaderLoginScreen(navController = navController)
        }

        //  composable(ReaderScreens.CreateAccountScreen.name) {
        //      Reader(navController = navController)
        //  }

        composable(ReaderScreens.ReaderHomeScreen.name) {
            ReaderHomeScreen(navController = navController)
        }

        composable(ReaderScreens.SearchScreen.name) {
            ReaderBookSearchScreen(navController = navController)
        }

        composable(ReaderScreens.DetailsScreen.name) {
            BookDetailsScreen(navController = navController)
        }

        composable(ReaderScreens.UpdateScreen.name) {
            BookUpdateScreen(navController = navController)
        }

        composable(ReaderScreens.ReadersStatsScreen.name) {
            ReaderStatsScreen(navController = navController)
        }
    }
}