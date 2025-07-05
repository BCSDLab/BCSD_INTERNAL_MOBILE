package com.bcsdlab.internal.data

import com.bcsdlab.internal.domain.enums.BuildType
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json

fun provideHttpClient(buildType: BuildType): HttpClient {
    return HttpClient(httpClientEngine()) {
        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.ALL
        }

        install(ContentNegotiation) {
            json()
        }

        install(DefaultRequest) {
            url(if (buildType == BuildType.Release) BASE_URL_PRODUCTION else BASE_URL_STAGE)
        }
    }
}

expect fun httpClientEngine(): HttpClientEngine
