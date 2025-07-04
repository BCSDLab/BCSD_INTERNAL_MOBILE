package com.bcsdlab.internal

import android.os.Build

actual class Platform actual constructor() {
    actual val os: String
        get() = "Android ${Build.VERSION.SDK_INT}"
    actual val model: String
        get() = Build.MODEL
}
