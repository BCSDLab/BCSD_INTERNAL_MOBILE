package com.bcsdlab.internal.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.bcsdlab.internal.main.navigation.MainRoutes
import com.bcsdlab.internal.main.navigation.internalMainGraph
import com.bcsdlab.internal.signin.SignInScreen

fun NavGraphBuilder.internalRootGraph(
    navController: NavController
) {
    navigation<InternalRoute.Main>(startDestination = MainRoutes.Home) {
        internalMainGraph(navController)
    }

    composable<InternalRoute.SignIn> {
        SignInScreen(
            onSignInSuccess = {
                navController.navigate(InternalRoute.Main)
            }
        )
    }
}