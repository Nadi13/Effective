package com.example.android_ck

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource

@Composable
fun CommentBlock(
    commentUi: String,
    modifier: Modifier = Modifier,
){
    Column(modifier = modifier){
        Row{
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(36.dp)
            ){
            }
        }
    }

}