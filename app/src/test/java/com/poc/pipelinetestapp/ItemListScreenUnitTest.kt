package com.poc.pipelinetestapp

import com.poc.pipelinetestapp.ui.Item
import com.poc.pipelinetestapp.ui.ItemScreenHelper
import org.junit.Assert
import org.junit.Test

class ItemListScreenUnitTest {
    @Test
    fun filterValidation() {
        Assert.assertEquals(
            ItemScreenHelper.filterItems(
                "Cherry", listOf(Item(1, "Apple", ""), Item(2, "Banana", ""), Item(3, "Cherry", ""))
            ), listOf(Item(3, "Cherry", ""))
        )
    }
}
