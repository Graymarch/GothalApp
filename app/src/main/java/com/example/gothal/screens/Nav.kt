package com.example.gothal.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

class Routes{
    companion object{
        const val HOME = "home"
    }
}

@Composable
fun Nav(
    pv: PaddingValues,
    navControl: NavHostController,
){
    NavHost(
        navController = navControl,
        startDestination = Routes.HOME,
        modifier = Modifier.padding(pv)
    ) {
        composable(route = Routes.HOME){

        }
    }
}