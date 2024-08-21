package com.github.t0in4.retrieveformats

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.github.t0in4.retrieveformats.ui.theme.RetrieveFormats
import com.github.t0in4.retrieveformats.viewmodel.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           RetrieveFormats {
                MainScreen()
            }
        }
    }
}
