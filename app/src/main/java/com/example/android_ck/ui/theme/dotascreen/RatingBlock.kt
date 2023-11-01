package com.example.android_ck

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text

@Composable
fun RatingBlock(
    rating: Float,
    reviewCount: String,
    modifier: Modifier = Modifier,
){
    Column(
        modifier = modifier
    ) {
        Text(
            text = rating.toString(),
            style = AppTheme.TextStyle.Bold_48
        )
        Text(
            text = reviewCount,
            style = TextStyle(fontSize = 12.sp)
        )
    }
}
