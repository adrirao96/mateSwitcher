package dev.ar.mateswitcher

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Power
import androidx.compose.material.icons.filled.PowerOff
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.ar.mateswitcher.ui.theme.components.MateSwitcher

@Composable
fun MainScreen(
    darkTheme: Boolean,
    dynamicTheme: Boolean,
    onDynamicUpdated: () -> Unit,
    onThemeUpdated: () -> Unit,
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MateSwitcher(
            darkTheme = darkTheme,
            onClick = onThemeUpdated
        )
        Spacer(modifier = Modifier.height(20.dp))
        MateSwitcher(
            darkTheme = darkTheme,
            size = 100.dp,
            padding = 5.dp,
            onClick = onThemeUpdated
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Dynamic mode",
            fontSize = 11.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold
        )
        MateSwitcher(
            darkTheme = dynamicTheme,
            size = 50.dp,
            padding = 5.dp,
            rightIcon = Icons.Default.PowerOff,
            leftIcon = Icons.Default.Power,
            onClick = onDynamicUpdated
        )
    }
}