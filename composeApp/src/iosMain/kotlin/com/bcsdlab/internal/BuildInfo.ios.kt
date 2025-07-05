package com.bcsdlab.internal

import com.bcsdlab.internal.domain.enums.BuildType
import kotlin.experimental.ExperimentalNativeApi
import kotlin.native.Platform

@OptIn(ExperimentalNativeApi::class)
actual fun getBuildType(): BuildType = if (Platform.isDebugBinary) BuildType.Debug else BuildType.Release
