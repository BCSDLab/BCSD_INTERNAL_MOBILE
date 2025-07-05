package com.bcsdlab.internal

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.backhandler.BackHandler
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.bcsdlab.internal.data.di.networkModule
import com.bcsdlab.internal.designsystem.theme.InternalTheme
import com.bcsdlab.internal.di.platformModule
import com.bcsdlab.internal.di.viewModelModule
import com.bcsdlab.internal.navigation.InternalRoute
import com.bcsdlab.internal.navigation.internalRootGraph
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.KoinApplication
import org.koin.dsl.KoinAppDeclaration

@OptIn(ExperimentalComposeUiApi::class)
@Composable
@Preview
fun App() {
    InternalTheme {
        val navController = rememberNavController()

        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            NavHost(
                modifier = Modifier.padding(innerPadding),
                navController = navController,
                startDestination = InternalRoute.SignIn
            ) {
                internalRootGraph(
                    navController = navController
                )
            }
        }

        BackHandler {
           navController.navigateUp()
       }
    }
}

internal fun internalAppDeclaration(additionalDeclaration: KoinApplication.() -> Unit = {}): KoinAppDeclaration =
    {
        modules(
            networkModule,
            platformModule,
            viewModelModule
        )
        additionalDeclaration()
    }
