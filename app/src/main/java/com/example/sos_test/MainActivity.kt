package com.example.sos_test

// An activity is a single screen, can be thought of as a page on a website.
// A box layout is like a stack, not the data structure, but more literally. It allows
// you to stack elements and overlap them.
// A composable is a function that tells the system what to display on the users screen, every UI element
// such as buttons, text, images, and boxes are a composable function.

import android.os.Bundle // Bundle class is used to pass data between activities, and restore saved state
import android.util.Log  // Import Log for logging in logcat
import androidx.activity.ComponentActivity // Needed to create activities that use Jetpack Compose
import androidx.activity.compose.setContent // Used to define UI
import androidx.compose.foundation.layout.Box // Used to be able to overlap elements on top of eachother
import androidx.compose.foundation.layout.fillMaxSize // Used to make a UI element take up as much space as possible
import androidx.compose.foundation.layout.size // Allows you to set height and width for a composable
import androidx.compose.foundation.shape.CircleShape // Used to create the buttons circle shape
import androidx.compose.material3.Button // Allows the use of buttons
import androidx.compose.material3.Text // Allows the use of text
import androidx.compose.ui.Alignment // Used to position elements
import androidx.compose.ui.Modifier // Modifier is as it sounds, it is a tool that describes how a UI element behaves
import androidx.compose.ui.draw.clip // Allows a composable (UI element) to be "cut" to a certain shape
import androidx.compose.ui.unit.dp // Helps your app to look good on all devices as the units are density independent
import com.example.sos_test.ui.theme.SOS_TestTheme // This is the custom theme for my app

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