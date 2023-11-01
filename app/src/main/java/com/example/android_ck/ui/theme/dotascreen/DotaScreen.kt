package com.example.android_ck

import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Divider
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
    val comments = listOf(
        "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
        "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers."
    )

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
        item{
            VideoPreviewRow(
                previewRelist = listOf(
                    R.drawable.bg_video1,
                    R.drawable.bg_video2,
                ),
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
            )
        }
        item{
            Text(
                text = "Review & Rating",
                style = AppTheme.TextStyle.Bold_16,
                color = AppTheme.TextColors.primary,
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 20.dp,
                    bottom = 12.dp,
                )
            )
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
        itemsIndexed(comments){index, item ->
            CommentBlock(
                item,
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 16.dp,
                    )
            )
            if (index<comments.lastIndex){
                Divider(
                    color = AppTheme.BgColors.divider,
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(
                            top = 12.dp,
                            bottom = 10.dp
                        ),
                )
            }

        }
        item{
            PrimaryButton(
                text = "Install",
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