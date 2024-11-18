package com.dwinurulazizah.aplikasiil.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import com.dwinurulazizah.aplikasiil.R
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier
    
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)) {
            Text(text = "Kategori Hewan", fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 12.dp))
            LazyRow {
                items(20) {
                    Card(
                        shape = RoundedCornerShape(8.dp),
                        elevation = 4.dp,
                        modifier = Modifier
                            .padding(8.dp)
                            .width(150.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(painter = painterResource(R.drawable.oip__1_),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(100.dp)

                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(text = "Harimau Sumatera", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                        }
                    }
                }
            }
            Text(text = "Binatang Buas", fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 12.dp))
            LazyColumn {
                items(50){ index ->
                    Row {

                    Card(
                        shape = RoundedCornerShape(8.dp),
                        elevation = 4.dp,
                        modifier = Modifier
                            .padding(8.dp)
                            .width(150.dp)
                            .fillMaxWidth().clickable {

                            }
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(painter = painterResource(R.drawable.oip__1_),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()

                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(text = "Harimau Sumatera", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                        }
                    }
                        Column {

                        Text(text = "Harimau sumatera", fontWeight = FontWeight.Bold)
                        Text(text = """Harimau sumatra adalah populasi Panthera tigris sondaica yang mendiami pulau Sumatra, Indonesia dan satu-satunya anggota subspesies harimau sunda yang masih bertahan hidup hingga saat ini.""")
                        }
                    }
                }
            }
        }
    }
}