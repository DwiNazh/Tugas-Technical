package com.dwinurulazizah.aplikasiil.navbottom

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val route: String, // Rute navigasi
    val title: String, // Nama tab
    val icon: ImageVector // Ikon tab
)
