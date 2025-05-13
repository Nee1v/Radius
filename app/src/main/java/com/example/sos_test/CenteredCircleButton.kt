package com.example.sos_test

import android.util.Log // Import Log for logging in logcat
import androidx.compose.foundation.layout.Box // Used to be able to overlap elements on top of eachother
import androidx.compose.foundation.layout.size // Allows you to set height and width for a composable
import androidx.compose.foundation.shape.CircleShape // Used to create the buttons circle shape
import androidx.compose.material3.Button // Allows the use of buttons
import androidx.compose.material3.Text // Allows the use of text
import androidx.compose.runtime.Composable // Used to designate a composable function, to use as an element in the app
import androidx.compose.ui.Alignment // Used to position elements
import androidx.compose.ui.Modifier // Modifier is as it sounds, it is a tool that describes how a UI element behaves
import androidx.compose.ui.draw.clip // Allows a composable (UI element) to be "cut" to a certain shape
import androidx.compose.ui.unit.dp // Helps your app to look good on all devices as the units are density independent
import androidx.compose.foundation.layout.fillMaxSize // Used to make a UI element take up as much space as possible

@Composable // Designate function as a Composable to use as a UI element
fun CenteredCircleButton(onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) { // Initiate a box element to fill up as much space as the parent container by using fillMaxSize, this allows
                                             //  us to position our button anywhere on the screen
        Button( // This is a Material Design Button from the imports, it triggers onClick when the user taps the button
            onClick = { // This is the built in function of the button from the import, which will call the custom onClick function
                Log.d("CenteredCircleButton", "Button was clicked!") // Log when the button is clicked
                onClick()  // Trigger the passed onClick action within the CenteredCircleButton function
            },
            modifier = Modifier //Initiate a modifier property to fine tune our button
                .size(150.dp)  // Set the button size
                .clip(CircleShape)  // Clip to make it circular
                .align(Alignment.Center)  // Center the button
        ) {
            Text("Press Me") // Display text within button
        }
    }
}
