package com.bcsdlab.internal

import androidx.compose.ui.window.ComposeUIViewController
import com.bcsdlab.internal.core.IgnoreKtlint
import org.koin.compose.KoinApplication

@IgnoreKtlint
fun MainViewController() =
    ComposeUIViewController {
        KoinApplication(
            application = internalAppDeclaration()
        ) {
            App()
        }
    }
