package com.bcsdlab.internal.data.di

import com.bcsdlab.internal.data.provideHttpClient
import org.koin.dsl.module

val networkModule =
    module {
        single { provideHttpClient(get(), get()) }
    }
