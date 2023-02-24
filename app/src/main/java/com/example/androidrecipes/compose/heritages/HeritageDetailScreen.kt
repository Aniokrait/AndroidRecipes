package com.example.androidrecipes.compose.heritages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HeritageDetailScreen(
    heritageId: Int,
) {
    Column {
        Text(text = "遺産ID：$heritageId")
    }
}