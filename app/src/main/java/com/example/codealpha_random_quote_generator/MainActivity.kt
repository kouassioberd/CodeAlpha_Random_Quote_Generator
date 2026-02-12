package com.example.codealpha_random_quote_generator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.codealpha_random_quote_generator.ui.screens.QuoteScreen
import com.example.codealpha_random_quote_generator.ui.theme.CodeAlpha_Random_Quote_GeneratorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodeAlpha_Random_Quote_GeneratorTheme {
                QuoteScreen()
            }
        }
    }
}