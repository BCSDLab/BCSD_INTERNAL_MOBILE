package com.bcsdlab.internal

actual class Platform actual constructor() {
    actual val os: String
        get() = "Java ${System.getProperty("java.version")}"
    actual val model: String
        get() = "Java"
}
