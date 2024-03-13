package com.example.paymentpawmedic.presentation.nvgraph

sealed class Route (
    val route: String
){
    object OnBoardingSccreen : Route(route = "onBoardingSreen")
    object HomeScreen: Route (route = "homeScreen")
    object SearchScreen: Route (route = "searchScreen")
    object BookmarkScreen: Route (route = "bookmarkScreen")
    object DetailsScreen: Route (route = "detailsScreen")
    object AppStartNavigation: Route (route = "appStartNavigation")
    object NewsNavigation: Route (route = "pawNavigation")
    object NewsNavigatorScreen: Route (route = "PawNavigator")
}
