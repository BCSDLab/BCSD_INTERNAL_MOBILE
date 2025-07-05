package com.bcsdlab.internal

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.koin.compose.KoinApplication

fun main() =
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "BCSD Internal"
        ) {
            KoinApplication(
                application = internalAppDeclaration()
            ) {
                App()
            }
        }
    }
