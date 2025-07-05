package com.bcsdlab.internal

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class InternalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(
            internalAppDeclaration {
                androidContext(this@InternalApplication)
            }
        )
    }
}
