package com.kolappan.personalpettagam.ui.screens.settings

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.UriHandler
import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class AboutDialogTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun aboutDialog_urlIsClickableAndOpensUri() {
        val expectedUrl = "https://github.com/kolappannathan/personal-pettagam"
        var openedUrl: String? = null

        val fakeUriHandler = object : UriHandler {
            override fun openUri(uri: String) {
                openedUrl = uri
            }
        }

        composeTestRule.setContent {
            CompositionLocalProvider(LocalUriHandler provides fakeUriHandler) {
                AboutDialog(versionName = "1.0.0")
            }
        }

        composeTestRule.onNodeWithText(expectedUrl)
            .assertHasClickAction()
            .performClick()

        assertEquals(expectedUrl, openedUrl)
    }

    @Test
    fun aboutDialog_displaysCorrectVersionName() {
        val testVersion = "2.5.0"

        composeTestRule.setContent {
            AboutDialog(versionName = testVersion)
        }

        composeTestRule.onNodeWithText(testVersion).assertExists()
    }
}
