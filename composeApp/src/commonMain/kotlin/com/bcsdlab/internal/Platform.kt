package com.bcsdlab.internal

expect class Platform() {
    val os: String
    val model: String
}
