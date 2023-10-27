package com.alexander.mintedreader.navigation

import java.lang.IllegalArgumentException

enum class ReaderScreens {
    SplashScreen,
    LoginScreen,
    CreateAccountScreen,
    ReaderHomeScreen,
    SearchScreen,
    DetailsScreen,
    UpdateScreen,
    ReadersStatsScreen;

    companion object {
        fun fromRoute(route: String?): ReaderScreens {
            return when(route?.substringBefore("/")) {
                SplashScreen.name -> SplashScreen
                LoginScreen.name -> LoginScreen
                CreateAccountScreen.name -> CreateAccountScreen
                ReaderHomeScreen.name -> ReaderHomeScreen
                SearchScreen.name -> SearchScreen
                DetailsScreen.name -> DetailsScreen
                UpdateScreen.name -> UpdateScreen
                ReadersStatsScreen.name -> ReadersStatsScreen
                null -> ReaderHomeScreen
                else -> throw IllegalArgumentException("Route $route is not recognized")
            }
        }
    }
}