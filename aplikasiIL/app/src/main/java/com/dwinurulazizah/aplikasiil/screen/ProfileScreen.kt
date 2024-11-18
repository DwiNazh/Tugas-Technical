package com.dwinurulazizah.aplikasiil.screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.dwinurulazizah.aplikasiil.R

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Scaffold(modifier=modifier) {
        Column(modifier = Modifier.padding(it), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(R.drawable.whatsapp_image_2024_11_18_at_16_45_05_daff1e00),
                contentDescription = null, modifier = Modifier
                    .clip(
                        shape = RoundedCornerShape(
                            corner = CornerSize(20.dp)
                        )
                    )
                    .padding(start = 20.dp))
            Spacer(modifier = Modifier.height(40.dp))
            Text(text = "Email : dwinurul0904@gmail.com\nnama: Dwi Nurul Azizah\nUniversitas: Politeknik Negeri Batam\nProdi:Rekayasa perangkat lunak")
        }
    }
}