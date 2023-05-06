package dev.ar.mateswitcher.ui.theme.components

import android.annotation.SuppressLint
import android.app.ActionBar
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MateActionBar(
    content: @Composable () -> Unit,
) {
    val EMOJI_MATE = "\uD83E\uDDC9"
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = if (isSystemInDarkTheme()) MaterialTheme.colorScheme.primaryContainer
                    else MaterialTheme.colorScheme.secondaryContainer
                ),
                title = {
                    Text(
                        text = "$EMOJI_MATE Switcher",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            content()
        }
    }
}