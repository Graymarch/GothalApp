package com.example.gothal.nav

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

class Routes{
    companion object{
        const val HOME = "home"
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Nav(){
    val navControl = rememberNavController();
    val backstack by navControl.currentBackStackEntryAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Gothal")
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar {
                NavigationBar {
                    NavigationBarItem(
                        selected = backstack?.destination?.route == Routes.HOME,
                        onClick = {navControl.navigate(Routes.HOME)},
                        icon = {},
                        label = {Text(text = "Home")}
                    )
                }
            }
        }
    ) { cv ->
        NavHost(
            navController = navControl,
            startDestination = Routes.HOME,
            modifier = Modifier
                .padding(cv)
        ){
            composable(
                route = Routes.HOME
            ) {

            }
        }
    }
}