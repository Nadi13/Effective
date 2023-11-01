package com.example.android_ck

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_ck.ui.theme.AppTheme
import android.widget.RatingBar;
import androidx.compose.foundation.layout.*
import androidx.compose.ui.res.painterResource

@Composable
fun RatingBlock(
    rating: Float,
    reviewCount: String,
    modifier: Modifier = Modifier,
){
    Row(modifier = modifier)
    {
        Text(
            text = rating.toString(),
            style = AppTheme.TextStyle.Bold_48,
            color = AppTheme.TextColors.primary,
        )
        Column(modifier = Modifier.offset(16.dp, 17.dp)) {
            Image(
                painter = painterResource(R.drawable.raiting),
                contentDescription = null,
                modifier = Modifier
                    .width(76.dp)
                    .height(12.dp),
            )
            Text(
                text = reviewCount,
                style = AppTheme.TextStyle.Regular_12_05,
                color = AppTheme.TextColors.primary,
                modifier = Modifier
                    .padding(top = 7.dp)
            )
        }

    }
}

@Preview
@Composable
fun RatingBlockPreview(){
     RatingBlock(
         rating = 4.9f,
         reviewCount = "70M Reviews",
         modifier = Modifier.padding(
             start = 24.dp,
             end = 24.dp,
             bottom = 16.dp,
         )
     )
}
