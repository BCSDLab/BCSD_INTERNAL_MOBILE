package com.bcsdlab.internal.di

import com.bcsdlab.internal.Platform
import com.bcsdlab.internal.getBuildType
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val platformModule = module {
    singleOf(::Platform)
    single { getBuildType() }
}
