package com.dwinurulazizah.aplikasiil

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.dwinurulazizah.aplikasiil.navbottom.BottomNavItem
import com.dwinurulazizah.aplikasiil.navbottom.BottomNavigationBar
import com.dwinurulazizah.aplikasiil.navbottom.NavigationGraph
import com.dwinurulazizah.aplikasiil.ui.theme.AplikasiILTheme
import kotlinx.coroutines.channels.ticker

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AplikasiILTheme {
                BottomNavigation()
            }
        }
    }
}

@Composable
fun BottomNavigation() {
    val navController = rememberNavController()

    // Daftar item navigasi
    val items = listOf(
        BottomNavItem("home", "Home", Icons.Filled.Home),
        BottomNavItem("list", "List", Icons.Filled.List),
        BottomNavItem("profile", "Profile", Icons.Filled.Person),
    )

    Scaffold(
        topBar = { TopAppBar(title = { Text(
            text = "Dwi Nurul Apps",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp, color = Color.White
        ) })},
        bottomBar = {
            BottomNavigationBar(navController = navController, items = items)
        },
        modifier = Modifier.padding(WindowInsets.systemBars.asPaddingValues())
    ) { innerPadding -> // Parameter contentPadding diterima sebagai innerPadding
        NavigationGraph(
            navController = navController,
            modifier = Modifier.padding(innerPadding) // Terapkan padding di konten
        )
    }
}
