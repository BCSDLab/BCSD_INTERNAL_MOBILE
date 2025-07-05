package com.bcsdlab.internal.di

import com.bcsdlab.internal.signin.SignInViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::SignInViewModel)
}