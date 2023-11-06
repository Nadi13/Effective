package com.example.android_ck

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_ck.ui.theme.AppTheme
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource

@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier
) {
    HeaderBackground(
        painter = painterResource(R.drawable.bg_header),
        modifier = modifier.fillMaxSize()
    ) {
            Row(Modifier.padding(start = 24.dp, top = 330.dp)) {
                DotaLogo(
                    painter = painterResource(R.drawable.dota_logo),
                ) {
                    Column(modifier = Modifier
                        .offset(105.dp, 17.dp)
                        .padding(top = 12.dp)) {
                        Text(
                            text = stringResource(R.string.name_game),
                            style = AppTheme.TextStyle.Bold_20_26,
                            color = AppTheme.TextColors.primary
                        )
                        Stars(
                            painter = painterResource(R.drawable.star),
                            modifier = modifier.padding(top = 7.dp)
                        ){
                            Row(modifier = Modifier.offset(85.dp, 0.dp)) {
                                Text(
                                    text = stringResource(R.string.counter),
                                    style = AppTheme.TextStyle.Regular_12_05,
                                    color = AppTheme.TextColors.grey
                                )
                            }
                        }
                    }

                }
            }
        }
}

@Composable
private fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
){
    Box(modifier = modifier){
        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .height(354.dp)
            )
        content()
    }
}

@Composable
private fun DotaLogo(
    painter: Painter,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
){
    Box(modifier = modifier
        .width(88.dp)
        .height(95.dp)
        .background(color = Color.Black, shape = RoundedCornerShape(13.5.dp))
        .border(
            width = 2.dp,
            color = AppTheme.BgColors.grey,
            shape = RoundedCornerShape(13.5.dp)
        )
    ){
        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
                .padding(17.dp)
                .aspectRatio(1f)
        )
        content()
    }
}

@Composable
private fun Stars(
    painter: Painter,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
){
    Box(modifier = modifier){
        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(76.dp)
                .height(12.dp)
        )
        content()
    }
}

@Preview
@Composable
fun DotaScreenHeaderPreview(){
    Surface(color = AppTheme.BgColors.primary)
    {
        DotaScreenHeader()
    }
}
