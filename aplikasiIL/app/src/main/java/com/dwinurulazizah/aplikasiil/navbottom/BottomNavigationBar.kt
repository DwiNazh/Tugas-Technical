package com.dwinurulazizah.aplikasiil.navbottom


import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun BottomNavigationBar(
    navController: NavController, // Mengatur navigasi
    items: List<BottomNavItem> // Daftar item navigasi
) {
    BottomNavigation {
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = navController.currentBackStackEntry?.destination?.route == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true // Simpan state layar sebelumnya
                        }
                        launchSingleTop = true // Hindari duplikasi layar
                        restoreState = true // Kembalikan state layar jika ada
                    }
                }
            )
        }
    }
}
