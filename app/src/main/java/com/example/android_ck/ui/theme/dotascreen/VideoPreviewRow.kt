package com.example.android_ck

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
                    .width(200.dp)
                    .height(100.dp)
                    .clip(shape = RoundedCornerShape(14.dp)),

            ) {
                Image(
                    painter = painterResource(item),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxSize(),
                )
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

