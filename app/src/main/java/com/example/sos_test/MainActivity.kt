package com.example.sos_test

import android.os.Bundle // Bundle class is used to pass data between activities, and restore saved state
import android.util.Log  // Import Log for logging in logcat
import androidx.activity.ComponentActivity // Needed to create activities that use Jetpack Compose
import androidx.activity.compose.setContent // Used to define UI
import com.example.sos_test.ui.theme.SOS_TestTheme // This is the custom theme for my app

class MainActivity : ComponentActivity() { // Defines a class called MainActivity similar to main in java, the start of the app
    override fun onCreate(savedInstanceState: Bundle?) { // Override superclass's onCreate function, use savedInstanceState to restore previous states

        super.onCreate(savedInstanceState) // Calls onCreate method of parent class to ensure proper initialization before setting up activity
        setContent { // setContent is used to display the UI for the activity

            SOS_TestTheme { // Default theme created when app was initially generated
                CenteredCircleButton( // Composable we created
                    onClick = {
                        Log.d("MainActivity", "Button was clicked from MainActivity!")
                    }
                )
            }
        }
    }
}