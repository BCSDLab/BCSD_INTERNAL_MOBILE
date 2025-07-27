package com.bcsdlab.internal.data.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.bcsdlab.internal.data.createDataStore
import com.bcsdlab.internal.data.dataStoreFileName
import org.koin.dsl.module

actual val dataModule = module {
    single { provideDataStore(get()) }
}

fun provideDataStore(context: Context): DataStore<Preferences> = createDataStore(
    producePath = { context.filesDir.resolve(dataStoreFileName).absolutePath }
)
