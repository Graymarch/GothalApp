package com.example.gothal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.gothal.screens.Nav
import com.example.gothal.ui.theme.GothalTheme
import com.example.gothal.viewModels.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GothalTheme {
                Main()
            }
        }
    }
}

@Composable
fun Main(){
    val mainVM : MainViewModel = viewModel()
    val navControl = rememberNavController()

    Scaffold() { pv ->
        Nav(
            pv = pv,
            navControl = navControl
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GothalTheme {
        Main()
    }
}