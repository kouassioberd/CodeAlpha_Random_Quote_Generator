package com.example.codealpha_random_quote_generator.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.codealpha_random_quote_generator.NetworkMonitor
import com.example.codealpha_random_quote_generator.viewmodel.QuoteViewModel


@Composable
fun QuoteScreen(vm: QuoteViewModel = viewModel()) {

    val context = LocalContext.current
    val networkMonitor = remember { NetworkMonitor(context) }

    val quote by vm.quote.collectAsStateWithLifecycle()
    val loading by vm.loading.collectAsStateWithLifecycle()
    val isConnected by networkMonitor.isConnected.collectAsState(initial = true)

    var showDialog by remember { mutableStateOf(false) }

    LaunchedEffect(isConnected) {
        if (!isConnected) {
            showDialog = true
        }
    }


    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            if (!isConnected) {
                Text(
                    text = "⚠ No Internet Connection",
                    color = MaterialTheme.colorScheme.error
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            if (loading) {
                CircularProgressIndicator()
            } else {

                Text(
                    text = quote?.q ?: "",
                    style = MaterialTheme.typography.headlineSmall,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "- ${quote?.a ?: ""}"
                )
                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    onClick = {
                        vm.getNewQuote()
                    },
                    enabled = isConnected // ✅ Disabled when offline
                ) {
                    Text("New Quote")
                }
            }

            // ✅ Offline Dialog
            if (showDialog) {
                AlertDialog(
                    onDismissRequest = { showDialog = false},
                    title = { Text("No Internet")},
                    text = { Text("Please turn on your internet connection to fetches quotes.")},
                    confirmButton = {
                        TextButton(
                            onClick = {
                                showDialog = false
                            }
                        ) {
                            Text("OK")
                        }
                    }
                )
            }

        }
    }
}