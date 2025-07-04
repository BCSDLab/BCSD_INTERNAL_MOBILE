package com.bcsdlab.internal

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import bcsdinternal.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.KoinApplication

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "BCSD Internal",
    ) {
        KoinApplication(
            application = internalAppDeclaration()
        ) {
            App()
        }
    }
}