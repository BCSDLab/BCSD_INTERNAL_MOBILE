package com.bcsdlab.internal.data.repository

import com.bcsdlab.internal.data.source.local.TokenLocalDataSource
import com.bcsdlab.internal.domain.repository.TokenRepository

class TokenRepositoryImpl(
    private val tokenLocalDataSource: TokenLocalDataSource
) : TokenRepository {
    override suspend fun getAccessToken(): String {
        return tokenLocalDataSource.getAccessToken()
    }

    override suspend fun saveAccessToken(accessToken: String) {
        tokenLocalDataSource.saveAccessToken(accessToken)
    }

    override suspend fun getRefreshToken(): String {
        return tokenLocalDataSource.getRefreshToken()
    }

    override suspend fun saveRefreshToken(refreshToken: String) {
        tokenLocalDataSource.saveRefreshToken(refreshToken)
    }
}
