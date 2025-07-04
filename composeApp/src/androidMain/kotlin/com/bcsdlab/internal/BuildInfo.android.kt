package com.bcsdlab.internal

import com.bcsdlab.internal.domain.enums.BuildType

actual fun getBuildType(): BuildType = if (BuildConfig.DEBUG) BuildType.Debug else BuildType.Release
