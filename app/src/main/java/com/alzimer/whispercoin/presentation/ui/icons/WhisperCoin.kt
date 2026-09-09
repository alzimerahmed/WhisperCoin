package com.alzimer.whispercoin.presentation.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Iconax.WhisperCoin: ImageVector
    get() {
        if (_WhisperCoin != null) {
            return _WhisperCoin!!
        }
        _WhisperCoin = ImageVector.Builder(
            name = "WhisperCoin",
            defaultWidth = 192.dp,
            defaultHeight = 192.dp,
            viewportWidth = 192f,
            viewportHeight = 192f
        ).apply {
            path(
                fill = SolidColor(Color.White),
                stroke = SolidColor(Color.Black),
                strokeLineCap = StrokeCap.Square,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(132.08f, 96f)
                lineTo(171.78f, 129.08f)
                arcTo(79.39f, 79.39f, -0f, isMoreThanHalf = true, isPositiveArc = true, 171.78f, 62.92f)
                lineTo(132.08f, 96f)
                close()
                moveTo(99.01f, 129.08f)
                lineTo(132.08f, 96f)
                lineTo(99.01f, 62.92f)
                lineTo(65.93f, 96f)
                lineTo(99.01f, 129.08f)
                close()
            }
        }.build()

        return _WhisperCoin!!
    }

@Suppress("ObjectPropertyName")
private var _WhisperCoin: ImageVector? = null
