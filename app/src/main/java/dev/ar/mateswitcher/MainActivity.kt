package dev.ar.mateswitcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.ar.mateswitcher.ui.theme.MateSwitcherTheme
import dev.ar.mateswitcher.ui.theme.components.MateActionBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var darkTheme by remember {
                mutableStateOf(false)
            }
            var dynamicMode by remember {
                mutableStateOf(false)
            }
            MateSwitcherTheme(darkTheme = darkTheme, dynamicColor = dynamicMode) {
                MateActionBar {
                    MainScreen(
                        darkTheme = darkTheme,
                        dynamicTheme = dynamicMode,
                        onDynamicUpdated = {
                            dynamicMode = !dynamicMode
                        }) {
                        darkTheme = !darkTheme
                    }
                }
            }
        }
    }
}