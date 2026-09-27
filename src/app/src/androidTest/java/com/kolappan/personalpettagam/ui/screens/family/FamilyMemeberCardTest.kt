package com.kolappan.personalpettagam.ui.screens.family

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class FamilyMemberCardTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun familyMemberCard_displaysName() {
        val name = "John Doe"
        composeTestRule.setContent {
            FamilyMemberCard(name = name, relation = "Self")
        }
        composeTestRule.onNodeWithText(name).assertExists()
    }

    @Test
    fun familyMemberCard_displaysRelation() {
        val relation = "Spouse"
        composeTestRule.setContent {
            FamilyMemberCard(name = "John Doe", relation = relation)
        }
        composeTestRule.onNodeWithText(relation).assertExists()
    }
}