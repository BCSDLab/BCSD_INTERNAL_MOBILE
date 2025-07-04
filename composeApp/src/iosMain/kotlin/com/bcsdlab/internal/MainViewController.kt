package com.bcsdlab.internal

import androidx.compose.ui.window.ComposeUIViewController
import org.koin.compose.KoinApplication

fun MainViewController() = ComposeUIViewController {
    KoinApplication(
        application = internalAppDeclaration(),
    ) {
        App()
    }
}