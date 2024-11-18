package com.dwinurulazizah.aplikasiil.navbottom

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.dwinurulazizah.aplikasiil.screen.HomeScreen
import com.dwinurulazizah.aplikasiil.screen.ListScreen
import com.dwinurulazizah.aplikasiil.screen.ProfileScreen

@Composable
fun NavigationGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = modifier // Terapkan modifier ke NavHost
    ) {
        composable("home") { HomeScreen() }
        composable("profile") { ProfileScreen() }
        composable("list") { ListScreen() }
    }
}
