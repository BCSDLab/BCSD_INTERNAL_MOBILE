package com.bcsdlab.internal.main.navigation

import androidx.compose.material3.Text
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.internalMainGraph(
    navController: NavController
) {
    composable<MainRoutes.Home> {
        Text("Home")
    }

    composable<MainRoutes.Info> {
        Text("Info")
    }
}
