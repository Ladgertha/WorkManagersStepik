package ru.ladgertha.workmanagersstepik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.ladgertha.workmanagersstepik.ui.theme.WorkManagersStepikTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WorkManagersStepikTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    WorkerButton(
                        "Worker", modifier = Modifier
                            .padding(innerPadding)
                            .padding(16.dp, 80.dp, 16.dp)
                            .fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Composable
fun WorkerButton(text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = {

        },
        modifier = modifier
    ) {
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WorkManagersStepikTheme {
        WorkerButton("Worker button")
    }
}