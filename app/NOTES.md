# Developer Notes

## Activity
- An activity is a single screen in an Android app, similar to a page on a website.

## Composables
- A composable is a function that defines UI elements using Jetpack Compose.



## Example function definition (line breakdown)

```kotlin
@Composable // Designate function as a Composable to use as a UI element
fun CenteredCircleButton(onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = {
                // Log when the button is clicked
                Log.d("CenteredCircleButton", "Button was clicked!")
                onClick()  // Trigger the passed onClick action
            },
            modifier = Modifier
                .size(150.dp)  // Set the button size
                .clip(CircleShape)  // Clip to make it circular
                .align(Alignment.Center)  // Center the button
        ) {
            Text("Press Me")
        }
    }
}
```

## fun CenteredCircleButton(onClick: () -> Unit) {
- `fun` = function, similar to def in python
- `CenteredCircleButton` is the function name
- `onClick` is the parameter name for CenteredCircleButton function, it is also a function itself
- `()` means that onClick takes no input parameters
- `--> Unit` is similar to saying that the return value is void, Unit = void, --> = return