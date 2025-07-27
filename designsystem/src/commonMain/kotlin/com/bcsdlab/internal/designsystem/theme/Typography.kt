package com.bcsdlab.internal.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

@Immutable
data class InternalTypography(
    val regular10: TextStyle,
    val regular12: TextStyle,
    val regular13: TextStyle,
    val regular14: TextStyle,
    val regular15: TextStyle,
    val regular16: TextStyle,
    val regular18: TextStyle,
    val medium12: TextStyle,
    val medium13: TextStyle,
    val medium14: TextStyle,
    val medium15: TextStyle,
    val medium16: TextStyle,
    val medium18: TextStyle,
    val bold12: TextStyle,
    val bold13: TextStyle,
    val bold14: TextStyle,
    val bold15: TextStyle,
    val bold16: TextStyle,
    val bold18: TextStyle,
    val bold20: TextStyle
)

fun defaultInternalTypography() = InternalTypography(
    regular10 = regular10,
    regular12 = regular12,
    regular13 = regular13,
    regular14 = regular14,
    regular15 = regular15,
    regular16 = regular16,
    regular18 = regular18,
    medium12 = medium12,
    medium13 = medium13,
    medium14 = medium14,
    medium15 = medium15,
    medium16 = medium16,
    medium18 = medium18,
    bold12 = bold12,
    bold13 = bold13,
    bold14 = bold14,
    bold15 = bold15,
    bold16 = bold16,
    bold18 = bold18,
    bold20 = bold20
)

internal val DefaultTextStyle: TextStyle =
    TextStyle(
        lineHeightStyle =
        LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        ),
        letterSpacing = 0.sp
    )

internal val regular10 =
    DefaultTextStyle.copy(
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 16.sp
    )
internal val regular12 =
    DefaultTextStyle.copy(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 19.2.sp
    )
internal val regular13 =
    DefaultTextStyle.copy(
        fontSize = 13.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 20.8.sp
    )
internal val regular14 =
    DefaultTextStyle.copy(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 22.4.sp
    )
internal val regular15 =
    DefaultTextStyle.copy(
        fontSize = 15.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp
    )
internal val regular16 =
    DefaultTextStyle.copy(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 25.6.sp
    )
internal val regular18 =
    DefaultTextStyle.copy(
        fontSize = 18.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 28.8.sp
    )

internal val medium12 =
    DefaultTextStyle.copy(
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 19.2.sp
    )
internal val medium13 =
    DefaultTextStyle.copy(
        fontSize = 13.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 20.8.sp
    )
internal val medium14 =
    DefaultTextStyle.copy(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 22.4.sp
    )
internal val medium15 =
    DefaultTextStyle.copy(
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 24.sp
    )
internal val medium16 =
    DefaultTextStyle.copy(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 25.6.sp
    )
internal val medium18 =
    DefaultTextStyle.copy(
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 28.8.sp
    )

internal val bold12 =
    DefaultTextStyle.copy(
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 19.2.sp
    )
internal val bold13 =
    DefaultTextStyle.copy(
        fontSize = 13.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 20.8.sp
    )
internal val bold14 =
    DefaultTextStyle.copy(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 22.4.sp
    )
internal val bold15 =
    DefaultTextStyle.copy(
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 24.sp
    )
internal val bold16 =
    DefaultTextStyle.copy(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 25.6.sp
    )
internal val bold18 =
    DefaultTextStyle.copy(
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 28.8.sp
    )
internal val bold20 =
    DefaultTextStyle.copy(
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 30.sp
    )
