package com.github.t0in4.retrieveformats.viewmodel

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ShowingCard(name: String, value: String) {
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        Row() {
            Column() {
                Text("${name} = ${value}", style = MaterialTheme.typography.headlineLarge)
            }
        }
    }
}
@Composable
fun MainScreen() {
    val viewModel: ResponseViewModel = viewModel()
    val formats = viewModel.responseState.value


    LazyColumn(
        contentPadding = PaddingValues(16.dp)
    ) {
        items(
          formats
        ) {format ->
            format.data.forEach {
                it.targets.forEach {
                   val name = it.name
                   val value = it.creditCost
                   ShowingCard(name = name.toString(), value = value.toString())
                }

            }
        }
    }
}