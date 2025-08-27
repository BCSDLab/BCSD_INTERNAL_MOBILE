package com.bcsdlab.internal.data.di.network

import org.koin.dsl.module

val networkModule =
    module {
        single { provideHttpClient(get(), get()) }
    }
