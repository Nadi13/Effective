package com.example.android_ck

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_ck.ui.theme.AppTheme
import com.google.android.material.chip.Chip

@Composable
fun ScrollableChipsRow(
    items: List<String>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues,
){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = contentPadding,
        modifier = modifier,
    ){
        items(items) { item ->
            Chip(content = item,
                backgroundColor = AppTheme.BgColors.secondery)
        }
    }
}

@Composable
fun Chip(
    content: String,
    backgroundColor: Color
) {
    Box(
        modifier = Modifier
            .background(backgroundColor)
            .padding(horizontal = 8.dp, vertical = 4.dp)
            .clip(RoundedCornerShape(100)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = content,
            style = AppTheme.TextStyle.Mon_10,
            color = AppTheme.TextColors.blue)
    }
}

@Preview
@Composable
fun ScrollableChipsRowPrewiew(){
    ScrollableChipsRow(
        items = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
        modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
        contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
    )
}