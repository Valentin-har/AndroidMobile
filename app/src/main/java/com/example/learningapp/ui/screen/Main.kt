package com.example.learningapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Main() {
    val list = listOf<String>("Musique", "Poadcast")
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
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                onClick = { /*TODO*/ }, modifier = Modifier
                    .weight(1f)
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
                    Text(text = "Titre likés", modifier = Modifier.weight(0.70f), textAlign = TextAlign.Center)
                }
            }
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                onClick = { /*TODO*/ }, modifier = Modifier
                    .weight(1f)
                    .padding(5.dp, 5.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://raplume.eu/wp-content/uploads/2021/09/PlaylistRap-1-770x770.jpg")
                            .build(), contentDescription = "", modifier = Modifier.weight(0.30f)
                    )
                    Text(text = "Playlist rap", modifier = Modifier.weight(0.70f), textAlign = TextAlign.Center)
                }
            }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                onClick = { /*TODO*/ }, modifier = Modifier
                    .weight(1f)
                    .padding(5.dp, 5.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://i.scdn.co/image/ab67706f000000029f66e905e5e5d71e5fda6e9e")
                            .build(), contentDescription = "", modifier = Modifier.weight(0.30f)
                    )
                    Text(text = "Playlist electro", modifier = Modifier.weight(0.70f), textAlign = TextAlign.Center)
                }

            }
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                onClick = { /*TODO*/ }, modifier = Modifier
                    .weight(1f)
                    .padding(5.dp, 5.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://i.scdn.co/image/ab67706f0000000237ddb11424d6babc80f304ac")
                            .build(), contentDescription = "", modifier = Modifier.weight(0.30f)
                    )
                    Text(text = "Playlist rock", modifier = Modifier.weight(0.70f), textAlign = TextAlign.Center)
                }
            }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                onClick = { /*TODO*/ }, modifier = Modifier
                    .weight(1f)
                    .padding(5.dp, 5.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://i.scdn.co/image/ab67706f000000022a2d103b23aeb9314c586e7b")
                            .build(), contentDescription = "", modifier = Modifier.weight(0.30f)
                    )
                    Text(text = "Playlist reggae", modifier = Modifier.weight(0.70f), textAlign = TextAlign.Center)
                }

            }
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                onClick = { /*TODO*/ }, modifier = Modifier
                    .weight(1f)
                    .padding(5.dp, 5.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://i.scdn.co/image/ab67706f000000026903496e5a845f3ad87125a2")
                            .build(), contentDescription = "", modifier = Modifier.weight(0.30f)
                    )
                    Text(text = "Radio", modifier = Modifier.weight(0.70f), textAlign = TextAlign.Center)
                }
            }
        }
        Text(text = "Artistes recommandés",  fontSize = 25.sp,modifier = Modifier.padding(0.dp, 35.dp))
        val theOffsping = object {
            val name = "The Offspring"
            val image = "https://i.scdn.co/image/ab6761610000e5ebd7c5bbf32459922a72ec0d31"
        }
        val listArtist = listOf<Artist>(Artist("The Offsping", "https://i.scdn.co/image/ab6761610000e5ebd7c5bbf32459922a72ec0d31"),
            Artist("Daft Punk", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQi1UDJUAiPFtyZVPjG5KBxQM_IcSzrMvsSetbKyvJRiGiS_CiUIZXtZ4KRQ1GiKPLoL2U&usqp=CAU"),
            Artist("Gazo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTPu9rM5LeFJjdfpkuUKuhFfOQlFiAOBNhR786aVXng4x-uPylRmPgjsrCLDVrdnO1ox5k&usqp=CAU"),
            Artist("BTS", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8WFIWEk0LT2l_6dQWXUhXNL8Wqc5I_w33FMQC3i6LkLI6sX9SmTwN22rOKVH4f7uT_zQ&usqp=CAU"),
            Artist("Imagine Dragon", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRITZe4oWuT8EAELayPr8lbaR_yWoMf88qJacLbFmIZIvaQQbEbvHF3CF8Mr7MQvuJJiPE&usqp=CAU"),
            Artist("Muse", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUhlNFDhPCfK5B-vINSjkYoz84Irfnd0Fon4K8eua1XPgh3rlrVYsQohkf9A3YtKUC1eI&usqp=CAU"),
            Artist("NTO", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTejwlh-IcxraVXc3uuueLWbYnuZNIbtguqNnC1rhW5iMFw7gZFfszRd4yuCLe6zKOrf88&usqp=CAU")
            )
       LazyRow(modifier = Modifier
            .weight(1f)
                , horizontalArrangement = Arrangement.spacedBy(1.dp)
            ) {

            items(listArtist) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                    onClick = { /*TODO*/ }, modifier = Modifier
                ){
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data(it.image)
                                .build(), contentDescription = "", modifier = Modifier
                                .weight(0.80f)
                                .clip(CircleShape)
                                .padding(
                                    bottom = 15.dp
                                )
                                .width(300.dp)
                                .height(350.dp)
                        )
                        Text(text = it.name, fontSize = 15.sp,textAlign = TextAlign.Center, modifier = Modifier.weight(0.20f))
                    }
                }
            }
        }
    }
}