package com.bcsdlab.internal.designsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

val LocalInternalColors = staticCompositionLocalOf {
    lightInternalColors()
}

val LocalInternalTypography = staticCompositionLocalOf {
    defaultInternalTypography()
}

@Composable
fun InternalTheme(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalInternalColors provides lightInternalColors(),
        LocalInternalTypography provides defaultInternalTypography(),
        content = content
    )
}

object InternalTheme {
    val colors: InternalColors
        @Composable
        get() = LocalInternalColors.current
    val typography: InternalTypography
        @Composable
        get() = LocalInternalTypography.current
}
