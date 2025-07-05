package com.bcsdlab.internal

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.bcsdlab.internal.data.di.networkModule
import com.bcsdlab.internal.designsystem.theme.InternalTheme
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
    InternalTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding)
            ) {
                Text(
                    platform
                )
                Button(
                    onClick = {}
                ) {
                    Text("Button")
                }
            }
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
