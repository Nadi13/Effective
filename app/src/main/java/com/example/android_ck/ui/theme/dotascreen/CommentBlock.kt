package com.example.android_ck

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_ck.ui.theme.AppTheme


@Composable
fun CommentBlock(
    CommentUi: CommentUi,
    modifier: Modifier = Modifier,
){
    Column(modifier = modifier){
        Row{
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(36.dp)
            ){
                Image(
                    painter = painterResource(CommentUi.image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )
            }
            Column(modifier = Modifier
                .offset(16.dp)
            ){
                Text(
                    text = CommentUi.name,
                    style = AppTheme.TextStyle.Regular_16,
                    color = AppTheme.TextColors.primary
                )
                Text(
                    text = CommentUi.date,
                    style = AppTheme.TextStyle.Regular_12_05,
                    color = AppTheme.TextColors.third,
                    modifier = Modifier.padding(top = 4.dp),
                )
            }

        }
        Text(
            text = CommentUi.text,
            style = AppTheme.TextStyle.Regular_12_20,
            color = AppTheme.TextColors.fourth,
            modifier = Modifier
                .padding(top = 16.dp, bottom = 14.dp)
        )
    }
}

@Preview
@Composable
fun CommentBlockPreview(){
    val comments = listOf(
        CommentUi(
            image = R.drawable.avatar1,
            name = stringResource(R.string.userName1),
            date = stringResource(R.string.date1),
            text = stringResource(R.string.comment1)
        ),
    )

    CommentBlock(
        CommentUi = comments[0],
        modifier = Modifier
            .padding(
                start = 24.dp,
                end = 24.dp,
                top = 16.dp,
            )
    )
}
