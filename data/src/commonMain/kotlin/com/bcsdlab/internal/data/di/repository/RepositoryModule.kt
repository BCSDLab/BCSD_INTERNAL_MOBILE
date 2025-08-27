package com.bcsdlab.internal.data.di.repository

import com.bcsdlab.internal.data.repository.TokenRepositoryImpl
import com.bcsdlab.internal.domain.repository.TokenRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule =
    module {
        singleOf(::TokenRepositoryImpl) { bind<TokenRepository>() }
    }
