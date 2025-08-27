package com.bcsdlab.internal.data.di

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.bcsdlab.internal.data.createDataStore
import com.bcsdlab.internal.data.dataStoreFileName
import kotlinx.cinterop.ExperimentalForeignApi
import org.koin.dsl.module
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSFileManager
import platform.Foundation.NSURL
import platform.Foundation.NSUserDomainMask

actual val dataModule = module {
    single { provideDataStore() }
}

@OptIn(ExperimentalForeignApi::class)
fun provideDataStore(): DataStore<Preferences> = createDataStore(
    producePath = {
        val documentDirectory: NSURL? = NSFileManager.defaultManager.URLForDirectory(
            directory = NSDocumentDirectory,
            inDomain = NSUserDomainMask,
            appropriateForURL = null,
            create = false,
            error = null
        )
        requireNotNull(documentDirectory).path + "/$dataStoreFileName"
    }
)
