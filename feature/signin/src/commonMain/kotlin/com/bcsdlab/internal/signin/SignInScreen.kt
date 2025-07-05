package com.bcsdlab.internal.signin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import bcsdinternal.feature.signin.generated.resources.Res
import bcsdinternal.feature.signin.generated.resources.sign_in_button
import bcsdinternal.feature.signin.generated.resources.sign_in_login_id
import bcsdinternal.feature.signin.generated.resources.sign_in_password
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect

@Composable
fun SignInScreen(
    modifier: Modifier = Modifier,
    viewModel: SignInViewModel = koinViewModel(),
    onSignInSuccess: () -> Unit = {}
) {
    val uiState by viewModel.collectAsState()

    viewModel.collectSideEffect {
        handleSideEffect(
            sideEffect = it,
            onSignInSuccess = onSignInSuccess
        )
    }

    SignInScreen(
        loginId = uiState.loginId,
        password = uiState.password,
        modifier = modifier,
        onLoginIdChange = viewModel::updateLoginId,
        onPasswordChange = viewModel::updatePassword,
        onSignIn = viewModel::signIn
    )
}

@Composable
private fun SignInScreen(
    loginId: String,
    password: String,
    modifier: Modifier = Modifier,
    onLoginIdChange: (String) -> Unit = {},
    onPasswordChange: (String) -> Unit = {},
    onSignIn: () -> Unit = {}
) {
    Column(
        modifier = modifier.fillMaxSize().padding(horizontal = 32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = loginId,
            onValueChange = onLoginIdChange,
            label = {
                Text(
                    text = stringResource(Res.string.sign_in_login_id)
                )
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = password,
            onValueChange = onPasswordChange,
            label = {
                Text(
                    text = stringResource(Res.string.sign_in_password)
                )
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onSignIn
        ) {
            Text(stringResource(Res.string.sign_in_button))
        }
    }
}

private fun handleSideEffect(
    sideEffect: SignInSideEffect,
    onSignInSuccess: () -> Unit = {},
    onSignInFailed: () -> Unit = {}
) {
    when (sideEffect) {
        SignInSideEffect.SignInSuccess -> onSignInSuccess()
        SignInSideEffect.SignInFailed -> onSignInFailed()
    }
}
