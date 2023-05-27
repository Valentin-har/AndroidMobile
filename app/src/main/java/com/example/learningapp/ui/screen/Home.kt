package com.example.learningapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SelectableChipColors
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.learningapp.R
import com.example.learningapp.ui.theme.Black80


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(){
    val list = listOf<String>("Musique", "Poadcast")
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Bonjour", color = MaterialTheme.colorScheme.onPrimary) },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    titleContentColor = MaterialTheme.colorScheme.primary,
                    containerColor = MaterialTheme.colorScheme.primary,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimary
                ),
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_notification),
                            contentDescription = ""
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_history),
                            contentDescription = ""
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_settings),
                            contentDescription = ""
                        )
                    }
                }
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = Color.Transparent
            ) {
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        selectedTextColor = Color.White
                    ),
                    selected = true,
                    onClick = { },
                    label = { Text(text = "Accueil") },
                    icon = { Icon(
                        painter = painterResource(id = R.drawable.ic_home),
                        contentDescription = "",
                        tint = Color.White,
                    )
                    })
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        selectedTextColor = Color.White,
                        indicatorColor = Color.Transparent
                    ),
                    selected = true,
                    onClick = { },
                    label = { Text(text = "Rechercher") },
                    icon = { Icon(
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = "",
                        tint = Color.White,
                    )
                    })
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        selectedTextColor = Color.White,
                        indicatorColor = Color.Transparent
                    ),
                    selected = true,
                    onClick = { },
                    label = { Text(text = "Bibliothèque") },
                    icon = { Icon(
                        painter = painterResource(id = R.drawable.ic_library),
                        contentDescription = "",
                        tint = Color.White,
                    )
                    })
            }
        }
    ) {
        Column(modifier = Modifier
            .padding(it)
            .padding(7.dp, 15.dp)) {
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
                Card(colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                    onClick = { /*TODO*/ }, modifier = Modifier.weight(1f).padding(0.dp, 5.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically){
                        AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://img.freepik.com/photos-premium/icone-3d-coeur-bleu-isole-fond-blanc-illustration-3d_394271-5854.jpg").build(),
                            contentDescription = "",
                            modifier = Modifier.weight(0.30f)
                        )
                        Text(text = "   Titre likés", modifier = Modifier.weight(0.70f))
                    }
                }
                Card(colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                    onClick = { /*TODO*/ }, modifier = Modifier.weight(1f).padding(5.dp, 5.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically){
                        AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://raplume.eu/wp-content/uploads/2021/09/PlaylistRap-1-770x770.jpg").build(), contentDescription = "", modifier = Modifier.weight(0.30f))
                        Text(text = "   Playlist rap", modifier = Modifier.weight(0.70f))
                    }
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                Card(colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                    onClick = { /*TODO*/ }, modifier = Modifier.weight(1f).padding(5.dp, 5.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically){
                        AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://i.scdn.co/image/ab67706f000000029f66e905e5e5d71e5fda6e9e").build(), contentDescription = "", modifier = Modifier.weight(0.30f))
                        Text(text = "   Playlist electro", modifier = Modifier.weight(0.70f))
                    }

                }
                Card(colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                    onClick = { /*TODO*/ }, modifier = Modifier.weight(1f).padding(5.dp, 5.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically){
                        AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://i.scdn.co/image/ab67706f0000000237ddb11424d6babc80f304ac").build(), contentDescription = "", modifier = Modifier.weight(0.30f))
                        Text(text = "   Playlist rock", modifier = Modifier.weight(0.70f))
                    }
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                Card(colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                    onClick = { /*TODO*/ }, modifier = Modifier.weight(1f).padding(5.dp, 5.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically){
                        AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://i.scdn.co/image/ab67706f000000022a2d103b23aeb9314c586e7b").build(), contentDescription = "", modifier = Modifier.weight(0.30f))
                        Text(text = "   Playlist reggae", modifier = Modifier.weight(0.70f))
                    }

                }
                Card(colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                    onClick = { /*TODO*/ }, modifier = Modifier.weight(1f).padding(5.dp, 5.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically){
                        AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://i.scdn.co/image/ab67706f000000026903496e5a845f3ad87125a2").build(), contentDescription = "", modifier = Modifier.weight(0.30f))
                        Text(text = "   Radio", modifier = Modifier.weight(0.70f))
                    }
                }
            }
            AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22").build(), contentDescription = "", modifier = Modifier
                .weight(0.10f)
                .clip(
                    CircleShape
                ))
        }
    }
}