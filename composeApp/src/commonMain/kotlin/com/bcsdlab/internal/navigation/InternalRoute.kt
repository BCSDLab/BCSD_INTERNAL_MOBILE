package com.bcsdlab.internal.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class InternalRoute {
    @Serializable object Main : InternalRoute()

    @Serializable object SignIn : InternalRoute()
}
