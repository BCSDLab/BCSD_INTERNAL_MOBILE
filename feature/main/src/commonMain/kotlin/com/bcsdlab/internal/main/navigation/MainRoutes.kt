package com.bcsdlab.internal.main.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class MainRoutes {
    @Serializable object Home : MainRoutes()
    @Serializable object Info : MainRoutes()
}