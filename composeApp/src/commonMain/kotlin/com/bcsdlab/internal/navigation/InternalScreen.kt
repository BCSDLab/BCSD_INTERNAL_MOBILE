package com.bcsdlab.internal.navigation

sealed class InternalScreen {
    object Main : InternalScreen()
    object SignIn : InternalScreen()
}