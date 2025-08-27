package com.bcsdlab.internal.data.di

import com.bcsdlab.internal.data.source.local.TokenLocalDataSource
import org.koin.dsl.module

val dataSourceModule =
    module {
        single { TokenLocalDataSource(get()) }
    }
