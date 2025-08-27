package com.bcsdlab.internal.data.di.datasource

import com.bcsdlab.internal.data.source.local.TokenLocalDataSource
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataSourceModule =
    module {
        singleOf(::TokenLocalDataSource)
    }
