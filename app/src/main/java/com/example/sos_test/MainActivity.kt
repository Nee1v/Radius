package com.example.sos_test

import android.os.Bundle // Bundle class is used to pass data between activities, and restore saved state
import android.util.Log  // Import Log for logging in logcat
import androidx.activity.ComponentActivity // Needed to create activities that use Jetpack Compose
import androidx.activity.compose.setContent // Used to define UI
import com.example.sos_test.ui.theme.SOS_TestTheme // This is the custom theme for my app
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Use saved state
        setContent {
            val navController = rememberNavController() // Create a NavController to navigate from activities

            SOS_TestTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    NavHost(navController = navController, startDestination = "main") { // Set MainScreen as start destination
                        composable("main") { // MainScreen
                            MainScreen(navController = navController)
                        }
                        composable("second") { // SecondScreen
                            SecondScreen(navController = navController)
                        }
                    }
                }
            }
        }
    }
}