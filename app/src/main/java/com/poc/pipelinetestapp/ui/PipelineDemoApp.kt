package com.poc.pipelinetestapp.ui

import androidx.activity.compose.BackHandler
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun PipelineDemoApp() {
    var selectedItem by remember { mutableStateOf<Item?>(null) }
    BackHandler(enabled = selectedItem != null) {
        selectedItem = null
    }

    Surface(color = MaterialTheme.colorScheme.background) {
        if (selectedItem == null) {
            ItemListScreen(
                items = sampleItems,
                onItemClick = { item -> selectedItem = item }
            )
        } else {
            ItemDetailScreen(item = selectedItem!!)
        }
    }
}

val sampleItems = listOf(
    Item(1, "Apple", "A red fruit"),
    Item(2, "Banana", "A yellow fruit"),
    Item(3, "Cherry", "A small red fruit"),
    Item(4, "Date", "A sweet brown fruit"),
    Item(5, "Elderberry", "A small, dark purple fruit"),
    Item(6, "Fig", "A soft fruit with a sweet taste"),
    Item(7, "Grape", "A small, juicy fruit that comes in bunches"),
    Item(8, "Honeydew", "A sweet green melon"),
    Item(9, "Kiwi", "A small fruit with brown skin and green flesh"),
    Item(10, "Lemon", "A sour yellow fruit")
)
