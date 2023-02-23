package com.example.androidrecipes.compose.screen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage

@Composable
fun HomeScreen(
    navigateToHeritageList: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        AsyncImage(
            model = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/A_cat_on_a_motorcycle_in_the_medina_of_Tunis_20171017_131525.jpg/1600px-A_cat_on_a_motorcycle_in_the_medina_of_Tunis_20171017_131525.jpg?20210119123505",
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Button(onClick = { navigateToHeritageList() }) {
            Text("文化遺産リストに遷移")
        }
    }
}