package com.example.android_ck

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_ck.ui.theme.AppTheme

@Composable
fun VideoPreviewRow(
    previewRelist: List<Int>,
    contentPadding: PaddingValues,
){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        contentPadding = contentPadding,
    ) {
        items(previewRelist) { item ->
            Box(
                modifier = Modifier
                    .width(240.dp)
                    .height(135.dp)
                    .clip(shape = RoundedCornerShape(14.dp)),

            ) {
                Image(
                    painter = painterResource(item),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxSize(),
                )
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .align(Alignment.Center)
                        .size(48.dp)
                        .background(AppTheme.BgColors.third)
                        .blur(1.5.dp)
                        .border(
                            width = 0.7.dp,
                            color = AppTheme.BgColors.circuit,
                            shape = CircleShape
                        )
                ){
                    Image(
                        painter = painterResource(R.drawable.arrow_right),
                        contentDescription = "play",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .width(24.dp)
                            .height(24.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun VideoPreviewRowReview(){
    VideoPreviewRow(
    previewRelist = listOf(
    R.drawable.bg_video1,
    R.drawable.bg_video2,),
    contentPadding = PaddingValues(start = 24.dp, end = 24.dp))
}
