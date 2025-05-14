package com.example.sos_test

import androidx.compose.material3.* // Import all material 3 UI elements
import androidx.compose.runtime.Composable // Allows us to create composables
import androidx.compose.ui.Alignment // Allows for alignment of elements
import androidx.compose.foundation.layout.* // Allows fot use of box and fillMaxSize in this case
import androidx.compose.ui.Modifier // Allows us to attach modifiers to elements to change them
import androidx.compose.ui.unit.dp // Allows for elements to look good on all screens
import androidx.navigation.NavController // NavController for navigating to other screens

@Composable
fun SecondScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("This is the Second Screen!")

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    // Pop the back stack to navigate back to the MainScreen
                    navController.popBackStack()
                }
            ) {
                Text("Go Back")
            }
        }
    }
}
