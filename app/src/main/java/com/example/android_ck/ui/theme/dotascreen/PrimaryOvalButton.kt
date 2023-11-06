package com.example.android_ck

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_ck.ui.theme.AppTheme

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
){
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(Color(0xFFF4D144)),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 40.dp)
            .height(64.dp),
        shape = RoundedCornerShape(12.dp),
    ){
        Text(
            text = text,
            style = AppTheme.TextStyle.Bold_20_26,
            color = AppTheme.TextColors.darkGrey,
            modifier = Modifier.wrapContentSize(Alignment.Center),
        )
    }
}

@Preview
@Composable
fun PrimaryButtonPreview(){

    val context = LocalContext.current
    PrimaryButton(
        text = stringResource(R.string.install),
        onClick = {
            Toast.makeText(context, "CLICKED", Toast.LENGTH_LONG).show()
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 24.dp,
                end = 24.dp,
                top = 20.dp,
                bottom = 40.dp,
            )
    )
}
