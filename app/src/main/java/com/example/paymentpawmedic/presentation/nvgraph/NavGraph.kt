package com.example.paymentpawmedic.presentation.nvgraph

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.paymentpawmedic.presentation.beranda.HomeScreen
import com.example.paymentpawmedic.presentation.onboarding.OnBoardingScreen
import com.example.paymentpawmedic.presentation.onboarding.OnBoardingViewModel


@Composable
fun NavGraph(
    startDestination: String
) {
    val navController= rememberNavController()

    NavHost(navController = navController, startDestination = startDestination){
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ){
            composable(
                route = Route.OnBoardingScreen.route
            ){
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )

            }
        }
       navigation(
            route = Route.PawNavigation.route,
            startDestination = Route.PawNavigatorScreen.route
        ){
           composable(route = Route.PawNavigatorScreen.route){
              HomeScreen()
           }
       }

    }

}

