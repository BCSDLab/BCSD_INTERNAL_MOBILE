package com.bcsdlab.internal.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import com.bcsdlab.internal.designsystem.theme.gray90

val LocalTextColors = compositionLocalOf { DefaultTextColors }

val DefaultTextColors = TextColors(
    color = gray90,
    backgroundColor = Color.Transparent
)

data class TextColors(
    val color: Color,
    val backgroundColor: Color
)

@Composable
fun Text(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = LocalTextColors.current.color,
    backgroundColor: Color = LocalTextColors.current.backgroundColor,
    style: TextStyle = TextStyle.Default,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    autoSize: TextAutoSize? = null,
) {
    BasicText(
        text = text,
        modifier = modifier.background(backgroundColor),
        style = style.merge(
            color = color
        ),
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        autoSize = autoSize
    )
}

