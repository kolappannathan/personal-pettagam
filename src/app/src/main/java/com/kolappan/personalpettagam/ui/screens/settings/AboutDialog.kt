package com.kolappan.personalpettagam.ui.screens.settings

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kolappan.personalpettagam.R
import com.kolappan.personalpettagam.ui.theme.PersonalPettagamTheme

@Composable
fun AboutDialog(
    versionName: String
) {
    val uriHandler = LocalUriHandler.current

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Column {
            Text(
                text = "App Name",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Column {
            Text(
                text = "Version",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                text = versionName,
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Column {
            Text(
                text = "License",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                text = "GPL v2",
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Column {
            Text(
                text = "Source Code",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                text = "https://github.com/kolappannathan/personal-pettagam",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.primary,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable {
                    uriHandler.openUri("https://github.com/kolappannathan/personal-pettagam")
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AboutDialogPreview() {
    PersonalPettagamTheme {
        AboutDialog(versionName = "1.0.0")
    }
}