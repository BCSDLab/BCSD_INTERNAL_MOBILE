package com.bcsdlab.internal.data

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json

fun provideHttpClient(): HttpClient {
    return HttpClient(httpClientEngine()) {
        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.ALL
        }

        install(ContentNegotiation) {
            json()
        }

        install(DefaultRequest) {
            url(BASE_URL_STAGE) // TODO: Hardcode now
        }
    }
}

expect fun httpClientEngine(): HttpClientEngine