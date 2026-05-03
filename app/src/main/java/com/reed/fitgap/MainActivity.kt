package com.reed.fitgap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

// Add this import for Experimental Material3 API
import androidx.compose.material3.ExperimentalMaterial3Api

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

// Add @OptIn annotation here as your professor said
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    MaterialTheme {
        Scaffold(
            topBar = {
                TopAppBar(title = { Text("FitGap") })
            }
        ) { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Welcome to FitGap!",
                    style = MaterialTheme.typography.headlineMedium
                )

                Spacer(modifier = Modifier.height(48.dp))

                Button(onClick = { }, modifier = Modifier.fillMaxWidth(0.85f)) {
                    Text("Add My Classes")
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(onClick = { }, modifier = Modifier.fillMaxWidth(0.85f)) {
                    Text("Find Workout Gaps")
                }

                Spacer(modifier = Modifier.height(48.dp))

                Text(
                    text = "No classes added yet.\nStart building your schedule!",
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}