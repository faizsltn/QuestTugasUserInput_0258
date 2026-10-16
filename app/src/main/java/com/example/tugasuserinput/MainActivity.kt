package com.example.tugasuserinput

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.tugasuserinput.ui.theme.TugasUserInputTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TugasUserInputTheme {
                // Menggunakan Surface untuk menampung tampilan form biodata
                Surface(modifier = Modifier.fillMaxSize()) {
                    BiodataScreen()
                }
            }
        }
    }
}