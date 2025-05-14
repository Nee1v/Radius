package com.example.sos_test

import androidx.compose.material3.* // Import all material 3 UI elements
import androidx.compose.runtime.Composable // Allows us to create composables
import androidx.compose.ui.Alignment // Allows for alignment of elements
import androidx.compose.foundation.layout.* // Allows fot use of box and fillMaxSize in this case
import androidx.compose.ui.Modifier // Allows us to attach modifiers to elements to change them
import androidx.compose.ui.unit.dp // Allows for elements to look good on all screens
import androidx.navigation.NavController // NavController for navigating to other screens

@Composable
fun SecondScreen(navController: NavController) { // Function SecondScreen takes in input called navController of type NavController
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) { // Align all child elements horizontally
            Text("This is the Second Screen!") // Placeholder text
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.popBackStack() }) { // Button to go back to main page
                Text("Go Back")
            }
        }
    }
}
