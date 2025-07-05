package com.bcsdlab.internal.signin

sealed class SignInSideEffect {
    object SignInSuccess : SignInSideEffect()
    object SignInFailed : SignInSideEffect()
}
