package com.example.androidrecipes.compose.heritages

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.androidrecipes.data.Heritage
import com.example.androidrecipes.data.heritages

@Composable
fun HeritageListScreen(
    navigateToHeritageDetail: (Int) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
    ) {
        items(heritages) { heritage ->
            HeritageListItem(heritage, navigateToHeritageDetail)
            Divider(modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun HeritageListItem(heritage: Heritage, navigateToHeritageDetail: (Int) -> Unit) {
    Row(
        modifier = Modifier.clickable {
            navigateToHeritageDetail(heritage.id)
        }
    ) {
        AsyncImage(
            model = heritage.imageUrl,
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )


        Text(heritage.name)
    }
}

@Composable
@Preview
fun HeritageListItemPreview() {
    HeritageListItem(heritages[0]) {}
}