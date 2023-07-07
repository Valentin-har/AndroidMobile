package com.example.learningapp.ui.screen

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.learningapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Library() {
    val list = listOf<String>("Playlists", "Artistes")
    Column(
        modifier = Modifier
            .padding(7.dp, 15.dp)
    ) {
        LazyRow(modifier = Modifier.padding(5.dp, 0.dp)) {
            items(list) {
                ElevatedFilterChip(
                    selected = false,
                    label = { Text(text = it) },
                    onClick = { /*TODO*/ },
                )
                Spacer(modifier = Modifier.width(10.dp))
            }
        }
        Column(modifier = Modifier.padding(12.dp, 0.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_library),
                    contentDescription = "",
                    tint = Color.White,
                );
                Text(text = "Récents",
                    modifier = Modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.ic_library),
                    contentDescription = "",
                    tint = Color.White,
                );
            }
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                onClick = { /*TODO*/ }, modifier = Modifier
                    .padding(0.dp, 5.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://img.freepik.com/photos-premium/icone-3d-coeur-bleu-isole-fond-blanc-illustration-3d_394271-5854.jpg")
                            .build(),
                        contentDescription = "",
                        modifier = Modifier.weight(0.30f)
                    )
                    Text(text = "   Titre likés", modifier = Modifier.weight(0.70f))
                }
            }
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                onClick = { /*TODO*/ }, modifier = Modifier
                    .padding(0.dp, 5.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://img.freepik.com/free-vector/flat-design-tattooed-old-people-illustration_23-2150279197.jpg?w=826&t=st=1688768143~exp=1688768743~hmac=2ac93227df1c33d6a65e209dfc36ec8965fc9ea254c8ef4fb0cd403824b3c219")
                            .build(),
                        contentDescription = "",
                        modifier = Modifier.weight(0.30f)
                    )
                    Text(text = " Punk metal", modifier = Modifier.weight(0.70f))
                }
            }
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                onClick = { /*TODO*/ }, modifier = Modifier
                    .padding(0.dp, 5.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://img.freepik.com/free-vector/sound-wave-equalizer-vector-design-set_53876-79097.jpg?w=826&t=st=1688768237~exp=1688768837~hmac=4dfa642da288706705b3005028e0a383dd81a46770c783386900bc0d2c88ff7d")
                            .build(),
                        contentDescription = "",
                        modifier = Modifier.weight(0.30f)
                    )
                    Text(text = " Ma playlist", modifier = Modifier.weight(0.70f))
                }
            }
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                onClick = { /*TODO*/ }, modifier = Modifier
                    .padding(0.dp, 5.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://img.freepik.com/free-photo/vintage-music_1048-3366.jpg?w=996&t=st=1688768585~exp=1688769185~hmac=35b50ea2557b14c8db9933fd507cc9f516370e1ca7f90ed160eb271150e7ce2e")
                            .build(),
                        contentDescription = "",
                        modifier = Modifier.weight(0.30f)
                    )
                    Text(text = " Classic", modifier = Modifier.weight(0.70f))
                }
            }
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                onClick = { /*TODO*/ }, modifier = Modifier
                    .padding(0.dp, 5.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://img.freepik.com/free-psd/watercolor-electronic-party-square-flyer_23-2149686550.jpg?w=826&t=st=1688768524~exp=1688769124~hmac=325298c441439c5e72fb7e6bfdfa453b37c09fe48e21debf1f78821680f9430f")
                            .build(),
                        contentDescription = "",
                        modifier = Modifier.weight(0.30f)
                    )
                    Text(text = " Electro", modifier = Modifier.weight(0.70f))
                }
            }
        }
    }
}