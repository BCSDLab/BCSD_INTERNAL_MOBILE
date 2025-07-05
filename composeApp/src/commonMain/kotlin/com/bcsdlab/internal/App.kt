package com.bcsdlab.internal

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.bcsdlab.internal.data.di.networkModule
import com.bcsdlab.internal.di.platformModule
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.KoinApplication
import org.koin.dsl.KoinAppDeclaration
import org.koin.mp.KoinPlatform

@Composable
@Preview
fun App() {
    val platform =
        KoinPlatform.getKoin().get<Platform>().let {
            "${it.model} with ${it.os}"
        }
    MaterialTheme {
        Scaffold(
            modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars),
            containerColor = Color.White
        ) {
            Text(
                platform
            )
        }
    }
}

internal fun internalAppDeclaration(additionalDeclaration: KoinApplication.() -> Unit = {}): KoinAppDeclaration =
    {
        modules(
            networkModule,
            platformModule
        )
        additionalDeclaration()
    }
