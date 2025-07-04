package com.bcsdlab.internal

import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual val os: String
        get() = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
    actual val model: String
        get() = UIDevice.currentDevice.name
}
