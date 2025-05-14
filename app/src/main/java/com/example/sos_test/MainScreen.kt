package com.example.sos_test

import android.util.Log // Import Log for logging in logcat
import androidx.compose.material3.* // Import all material 3 UI elements
import androidx.compose.runtime.Composable // Allows us to create composables
import androidx.compose.ui.Alignment // Allows for alignment of elements
import androidx.compose.foundation.layout.* // Allows fot use of box and fillMaxSize in this case
import androidx.compose.ui.Modifier // Allows us to attach modifiers to elements to change them
import androidx.compose.ui.unit.dp // Allows for elements to look good on all screens
import androidx.navigation.NavController // NavController for navigating to other screens

@Composable
fun MainScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(
            onClick = {
                // Navigate to the second screen
                navController.navigate("second")
            },
            modifier = Modifier.size(200.dp)
        ) {
            Text("Go to Second Screen")
        }
    }
}