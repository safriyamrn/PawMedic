package com.example.paymentpawmedic.presentation.nvgraph

sealed class Route (
    val route: String
){
    object OnBoardingScreen : Route(route = "onBoardingScreen")
    object HomeScreen: Route (route = "HomeScreen")
    object SearchScreen: Route (route = "searchScreen")
    object BookmarkScreen: Route (route = "bookmarkScreen")
    object DetailsScreen: Route (route = "detailsScreen")
    object AppStartNavigation: Route (route = "appStartNavigation")
    object PawNavigation: Route (route = "pawNavigation")
    object PawNavigatorScreen: Route (route = "PawNavigator")
}
