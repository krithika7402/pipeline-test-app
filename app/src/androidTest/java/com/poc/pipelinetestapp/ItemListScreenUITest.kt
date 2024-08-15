package com.poc.pipelinetestapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ItemListScreenUITest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    @Test
    fun clickItemNavigatesToDetail() {
        composeTestRule.onNodeWithText("Cherry").performClick()

        composeTestRule.onNodeWithText("Cherry").assertIsDisplayed()
        composeTestRule.onNodeWithText("A small red fruit").assertIsDisplayed()
    }

    @Test
    fun searchItemShowsAndNavigatesToDetail() {
        // Search for "Cherry"
        composeTestRule.onNodeWithText("Search").performTextInput("Cherry")

        // Check that the detail screen displays the correct information
        composeTestRule.onNodeWithTag("Cherry").assertIsDisplayed().performClick()
        composeTestRule.onNodeWithText("A small red fruit").assertIsDisplayed()

    }
}
