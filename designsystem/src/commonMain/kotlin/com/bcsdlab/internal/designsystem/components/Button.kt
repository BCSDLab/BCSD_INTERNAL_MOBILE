package com.bcsdlab.internal.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.bcsdlab.internal.designsystem.theme.InternalTheme

object ButtonDefaults {
    @Composable
    fun buttonColors(
        backgroundColor: Color = InternalTheme.colors.primary500,
        contentColor: Color = InternalTheme.colors.neutral0
    ): ButtonColors {
        return ButtonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    fun buttonPadding() = PaddingValues(vertical = 8.dp, horizontal = 16.dp)
}

data class ButtonColors(
    val backgroundColor: Color,
    val contentColor: Color
)

@Composable
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    shape: Shape = RoundedCornerShape(8.dp),
    contentPadding: PaddingValues = ButtonDefaults.buttonPadding(),
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .clip(shape)
            .background(colors.backgroundColor, shape)
            .clickable { onClick() }
            .padding(contentPadding),
        contentAlignment = Alignment.Center
    ) {
        val textColor = TextColors(
            color = colors.contentColor,
            backgroundColor = colors.backgroundColor
        )
        CompositionLocalProvider(LocalTextColors provides textColor) {
            content()
        }
    }
}
