package com.poc.pipelinetestapp.ui.theme

import androidx.activity.compose.BackHandler
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.poc.pipelinetestapp.ui.Item
import com.poc.pipelinetestapp.ui.ItemDetailScreen
import com.poc.pipelinetestapp.ui.ItemListScreen

@Composable
fun PipelineDemoApp() {
    var selectedItem by remember { mutableStateOf<Item?>(null) }
    BackHandler(enabled = selectedItem != null) {
        selectedItem = null
    }

    val sampleItems = listOf(
        Item(1, "Apple", "A red fruit"),
        Item(2, "Banana", "A yellow fruit"),
        Item(3, "Cherry", "A small red fruit")
    )

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