package com.example.android_ck

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_ck.ui.theme.AppTheme

@Composable
fun DotaScreen() {
    val context = LocalContext.current
    val lazyListState = rememberLazyListState()

    LazyColumn(
        state = lazyListState,
        modifier = Modifier.fillMaxSize(),
    ){
        item {
            DotaScreenHeader()
        }

        item {
            ScrollableChipsRow(
                items = listOf("MOBA", "MULTIPLAYER", "STRATEGY", "Drab Majesty", "Cold Cave", "Lifeover", "The Door"),
                modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
            )
        }
        item{
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                style = AppTheme.TextStyle.Regular_12_19,
                color = AppTheme.TextColors.secondery,
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 14.dp,
                    bottom = 14.dp,
                )

            )
        }
    }
}

@Preview
@Composable
fun DotaScreenPreview(){
    Surface(color = AppTheme.BgColors.darkGrey)
    {
        DotaScreen()
    }
}