package com.bcsdlab.internal.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class InternalColors(
    val primary900: Color,
    val primary800: Color,
    val primary700: Color,
    val primary600: Color,
    val primary500: Color,
    val primary400: Color,
    val primary300: Color,
    val primary200: Color,
    val primary100: Color,
    val sub900: Color,
    val sub800: Color,
    val sub700: Color,
    val sub600: Color,
    val sub500: Color,
    val sub400: Color,
    val sub300: Color,
    val sub200: Color,
    val sub100: Color,
    val neutral800: Color,
    val neutral700: Color,
    val neutral600: Color,
    val neutral500: Color,
    val neutral400: Color,
    val neutral300: Color,
    val neutral200: Color,
    val neutral100: Color,
    val neutral50: Color,
    val neutral0: Color,
    val danger700: Color,
    val danger600: Color,
    val danger500: Color,
    val danger400: Color,
    val danger300: Color,
    val danger200: Color,
    val danger100: Color,
    val danger50: Color,
    val warning700: Color,
    val warning600: Color,
    val warning500: Color,
    val warning400: Color,
    val warning300: Color,
    val warning200: Color,
    val warning100: Color,
    val warning50: Color,
    val success700: Color,
    val success600: Color,
    val success500: Color,
    val success400: Color,
    val success300: Color,
    val success200: Color,
    val success100: Color,
    val success50: Color,
    val info700: Color,
    val info600: Color,
    val info500: Color,
    val info400: Color,
    val info300: Color,
    val info200: Color,
    val info100: Color,
    val info50: Color
)

fun lightInternalColors() = InternalColors(
    primary900 = purple90,
    primary800 = purple80,
    primary700 = purple70,
    primary600 = purple60,
    primary500 = purple50,
    primary400 = purple40,
    primary300 = purple30,
    primary200 = purple20,
    primary100 = purple10,
    sub900 = orange90,
    sub800 = orange80,
    sub700 = orange70,
    sub600 = orange60,
    sub500 = orange50,
    sub400 = orange40,
    sub300 = orange30,
    sub200 = orange20,
    sub100 = orange10,
    neutral800 = gray90,
    neutral700 = gray80,
    neutral600 = gray70,
    neutral500 = gray60,
    neutral400 = gray50,
    neutral300 = gray40,
    neutral200 = gray30,
    neutral100 = gray20,
    neutral50 = gray10,
    neutral0 = gray5,
    danger700 = red70,
    danger600 = red60,
    danger500 = red50,
    danger400 = red40,
    danger300 = red30,
    danger200 = red20,
    danger100 = red10,
    danger50 = red5,
    warning700 = yellow70,
    warning600 = yellow60,
    warning500 = yellow50,
    warning400 = yellow40,
    warning300 = yellow30,
    warning200 = yellow20,
    warning100 = yellow10,
    warning50 = yellow5,
    success700 = green70,
    success600 = green60,
    success500 = green50,
    success400 = green40,
    success300 = green30,
    success200 = green20,
    success100 = green10,
    success50 = green5,
    info700 = skyBlue70,
    info600 = skyBlue60,
    info500 = skyBlue50,
    info400 = skyBlue40,
    info300 = skyBlue30,
    info200 = skyBlue20,
    info100 = skyBlue10,
    info50 = skyBlue5
)

// primary
internal val purple90 = Color(0xFF44025E)
internal val purple80 = Color(0xFF600481)
internal val purple70 = Color(0xFF7D08A4)
internal val purple60 = Color(0xFF980AC9)
internal val purple50 = Color(0xFFB611F5)
internal val purple40 = Color(0xFFC358FC)
internal val purple30 = Color(0xFFCE86FD)
internal val purple20 = Color(0xFFDDB1FE)
internal val purple10 = Color(0xFFEBD4FE)

// sub
internal val orange90 = Color(0xFF762E05)
internal val orange80 = Color(0xFF8F3F09)
internal val orange70 = Color(0xFFB1580F)
internal val orange60 = Color(0xFFD47415)
internal val orange50 = Color(0xFFF7941E)
internal val orange40 = Color(0xFFFAB655)
internal val orange30 = Color(0xFFFCCC77)
internal val orange20 = Color(0xFFFEE1A4)
internal val orange10 = Color(0xFFFEF2D1)

// neutral
internal val gray90 = Color(0xFF000000)
internal val gray80 = Color(0xFF1F1F1F)
internal val gray70 = Color(0xFF4B4B4B)
internal val gray60 = Color(0xFF727272)
internal val gray50 = Color(0xFFCACACA)
internal val gray40 = Color(0xFFE1E1E1)
internal val gray30 = Color(0xFFEEEEEE)
internal val gray20 = Color(0xFFF5F5F5)
internal val gray10 = Color(0xFFFAFAFA)
internal val gray5 = Color(0xFFFFFFFF)

// danger
internal val red70 = Color(0xFFEC2D30)
internal val red60 = Color(0xFFF64C4C)
internal val red50 = Color(0xFFEB6F70)
internal val red40 = Color(0xFFF49898)
internal val red30 = Color(0xFFFFCCD2)
internal val red20 = Color(0xFFFFEBEE)
internal val red10 = Color(0xFFFEF2F2)
internal val red5 = Color(0xFFFFFBFB)

// warning
internal val yellow70 = Color(0xFFFE9B0E)
internal val yellow60 = Color(0xFFFFAD0D)
internal val yellow50 = Color(0xFFFFC62B)
internal val yellow40 = Color(0xFFFFDD82)
internal val yellow30 = Color(0xFFFFEAB3)
internal val yellow20 = Color(0xFFFFF7E1)
internal val yellow10 = Color(0xFFFFF9EE)
internal val yellow5 = Color(0xFFFFFDFA)

// success
internal val green70 = Color(0xFF0C9D61)
internal val green60 = Color(0xFF47B881)
internal val green50 = Color(0xFF6BC497)
internal val green40 = Color(0xFF97D4B4)
internal val green30 = Color(0xFFC0E5D1)
internal val green20 = Color(0xFFE5F5EC)
internal val green10 = Color(0xFFF2FAF6)
internal val green5 = Color(0xFFFBFEFC)

// info
internal val skyBlue70 = Color(0xFF3A70E2)
internal val skyBlue60 = Color(0xFF3B82F3)
internal val skyBlue50 = Color(0xFF4BA1FF)
internal val skyBlue40 = Color(0xFF93C8FF)
internal val skyBlue30 = Color(0xFFBDDDFF)
internal val skyBlue20 = Color(0xFFE4F2FF)
internal val skyBlue10 = Color(0xFFF1F8FF)
internal val skyBlue5 = Color(0xFFF8FCFF)
