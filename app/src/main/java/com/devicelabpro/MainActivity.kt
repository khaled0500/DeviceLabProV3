package com.devicelabpro

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    DashboardScreen()
                }
            }
        }
    }
}

@Composable
fun DashboardScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {

        Text(
            text = "🚀 DeviceLabPro V4",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        DashboardCard(
            title = "📱 Device Information",
            content = """
Model: ${Build.MODEL}
Manufacturer: ${Build.MANUFACTURER}
Android: ${Build.VERSION.RELEASE}
SDK: ${Build.VERSION.SDK_INT}
            """.trimIndent()
        )

        DashboardCard(
            title = "🧠 CPU",
            content = """
Architecture: ${System.getProperty("os.arch")}
Available Cores: ${Runtime.getRuntime().availableProcessors()}
            """.trimIndent()
        )

        DashboardCard(
            title = "💾 Memory",
            content = """
Runtime Max Memory:
${Runtime.getRuntime().maxMemory() / 1024 / 1024} MB

Runtime Free Memory:
${Runtime.getRuntime().freeMemory() / 1024 / 1024} MB
            """.trimIndent()
        )

        DashboardCard(
            title = "🎮 Gaming Analysis",
            content = """
Gaming Score: 85/100
Thermal Score: 82/100
Stability Score: 88/100
            """.trimIndent()
        )

        DashboardCard(
            title = "🔥 Thermal Status",
            content = """
CPU Temp: Reading...
GPU Temp: Reading...
Battery Temp: Reading...
            """.trimIndent()
        )

        DashboardCard(
            title = "⚡ System Status",
            content = "Running"
        )
    }
}

@Composable
fun DashboardCard(
    title: String,
    content: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = content
            )
        }
    }
}
