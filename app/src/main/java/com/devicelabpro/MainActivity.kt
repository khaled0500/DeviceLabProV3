package com.devicelabpro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column(Modifier.padding(20.dp)) {
                    Text("🎮 DeviceLabPro V3")
                    Text("🚀 Gaming Performance Dashboard Ready")
                }
            }
        }
    }
}
