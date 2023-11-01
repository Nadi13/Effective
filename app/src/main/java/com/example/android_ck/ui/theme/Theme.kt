package com.example.android_ck.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.text.TextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

object AppTheme {
    object BgColors{
       val primary = Color(color = 0xFFFFFBFE)
        val grey = Color(color = 0xFF1F2430)
        val darkGrey = Color(color = 0xFF050B18)

    }
    object TextColors{
        val primary = Color(color = 0xFFFFFBFE)
        val grey = Color(color = 0xFF45454D)
    }


    object TextStyle{

        val Bold_20_26
        @Composable
        get() =
            TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                lineHeight = 26.sp,
                letterSpacing = 0.5.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional,
                    LineHeightStyle.Trim.None
                ),
            )

        val Regular_12_05
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontSize = 12.sp,
                    letterSpacing = 0.5.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    ),
                )
    }
}