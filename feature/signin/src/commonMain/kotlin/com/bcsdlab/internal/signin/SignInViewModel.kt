package com.bcsdlab.internal.signin

import androidx.lifecycle.ViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.blockingIntent
import org.orbitmvi.orbit.viewmodel.container

class SignInViewModel : ContainerHost<SignInState, SignInSideEffect>, ViewModel() {
    override val container: Container<SignInState, SignInSideEffect> = container(SignInState())

    fun updateLoginId(loginId: String) = blockingIntent {
        reduce {
            state.copy(
                loginId = loginId
            )
        }
    }

    fun updatePassword(password: String) = blockingIntent {
        reduce {
            state.copy(
                password = password
            )
        }
    }

    fun signIn() = intent {
        postSideEffect(SignInSideEffect.SignInSuccess)
    }
}
