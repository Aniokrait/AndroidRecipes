package com.example.androidrecipes.compose.heritages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.androidrecipes.data.viewmodel.HeritageViewModel

@Composable
fun HeritageDetailScreen(
    heritageId: Int,
    viewModel: HeritageViewModel = hiltViewModel()
) {
    Column {
        Text(text = "遺産ID：$heritageId")
        Text(text = viewModel.description.value)
    }
}