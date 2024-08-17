package com.poc.pipelinetestapp

import com.poc.pipelinetestapp.ui.Item
import com.poc.pipelinetestapp.ui.filterItems
import com.poc.pipelinetestapp.ui.sampleItems
import org.junit.Assert
import org.junit.Test

class ItemListScreenUnitTest {
    @Test
    fun filterValidation() {
        Assert.assertEquals(
            filterItems("Cherry", sampleItems),
            listOf(sampleItems[2])
        )
    }
}
