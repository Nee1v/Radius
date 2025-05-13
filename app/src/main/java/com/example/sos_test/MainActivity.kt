package com.example.sos_test

import android.os.Bundle
import android.util.Log  // Import Log for logging
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.sos_test.ui.theme.SOS_TestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SOS_TestTheme {
                // Box to center the button
                Box(modifier = Modifier.fillMaxSize()) {
                    Button(
                        onClick = {
                            // Log a message when the button is clicked
                            Log.d("MainActivity", "Button was clicked!")
                        },
                        modifier = Modifier
                            .size(150.dp)  // Set button size
                            .clip(CircleShape)  // Clip the button to a circle
                            .align(Alignment.Center),  // Center the button
                    ) {
                        Text("Press Me")
                    }
                }
            }
        }
    }
}