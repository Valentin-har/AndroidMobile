package com.example.learningapp

import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.learningapp.ui.theme.LearningAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningAppTheme {
                val list = listOf<String>("Musique", "Poadcast")
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(text = "Good Morning", color = MaterialTheme.colorScheme.onPrimary)},
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
                            containerColor = MaterialTheme.colorScheme.primary
                        ) {
                            NavigationBarItem(
                                colors = NavigationBarItemDefaults.colors(
                                    selectedTextColor = MaterialTheme.colorScheme.onPrimary
                                ),
                                selected = true,
                                onClick = { },
                                label = { Text(text = "Accueil") },
                                icon = { Icon(
                                    painter = painterResource(id = R.drawable.ic_home),
                                    contentDescription = "",
                                )
                                })
                            NavigationBarItem(
                                colors = NavigationBarItemDefaults.colors(
                                    selectedTextColor = MaterialTheme.colorScheme.onPrimary
                                ),
                                selected = true,
                                onClick = { },
                                label = { Text(text = "Rechercher") },
                                icon = { Icon(
                                    painter = painterResource(id = R.drawable.ic_search),
                                    contentDescription = "",
                                )
                                })
                            NavigationBarItem(
                                colors = NavigationBarItemDefaults.colors(
                                    selectedTextColor = MaterialTheme.colorScheme.onPrimary
                                ),
                                selected = true,
                                onClick = { },
                                label = { Text(text = "Bibliothèque") },
                                icon = { Icon(
                                    painter = painterResource(id = R.drawable.ic_library),
                                    contentDescription = "",
                                )
                                })
                        }
                    }
                ) {
                    Column(modifier = Modifier
                        .padding(it)
                        .padding(10.dp, 10.dp)) {
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
                        Row() {
                            Card(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                                 onClick = { /*TODO*/ }, modifier = Modifier.weight(1f),
                                 elevation = CardDefaults.cardElevation(defaultElevation = 120.dp)) {
                                    Row(verticalAlignment = Alignment.CenterVertically){
                                        AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22").build(), contentDescription = "", modifier = Modifier.weight(0.25f))
                                        Text(text = "Flower", modifier = Modifier.weight(0.75f))
                                    }
                            }
                            Card(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary), onClick = { /*TODO*/ }, modifier = Modifier.weight(1f)) {
                                Row(verticalAlignment = Alignment.CenterVertically){
                                    AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSKsUEgwtViD44DclyOLQVxGEPE-J-VZlDPYQ&usqp=CAU").build(), contentDescription = "", modifier = Modifier.weight(0.25f))
                                    Text(text = "Smile", modifier = Modifier.weight(0.75f))
                                }
                            }
                        }
                        Row() {
                            Card(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary), onClick = { /*TODO*/ }, modifier = Modifier.weight(1f)) {
                                Row(verticalAlignment = Alignment.CenterVertically){
                                    AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22").build(), contentDescription = "", modifier = Modifier.weight(0.25f))
                                    Text(text = "Flower", modifier = Modifier.weight(0.75f))
                                }

                            }
                            Card(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary), onClick = { /*TODO*/ }, modifier = Modifier.weight(1f)) {
                                Row(verticalAlignment = Alignment.CenterVertically){
                                    AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSKsUEgwtViD44DclyOLQVxGEPE-J-VZlDPYQ&usqp=CAU").build(), contentDescription = "", modifier = Modifier.weight(0.25f))
                                    Text(text = "Smile", modifier = Modifier.weight(0.75f))
                                }
                            }
                        }
                        Row() {
                            Card(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary), onClick = { /*TODO*/ }, modifier = Modifier.weight(1f)) {
                                Row(verticalAlignment = Alignment.CenterVertically){
                                    AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22").build(), contentDescription = "", modifier = Modifier.weight(0.25f))
                                    Text(text = "Flower", modifier = Modifier.weight(0.75f))
                                }

                            }
                            Card(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary), onClick = { /*TODO*/ }, modifier = Modifier.weight(1f)) {
                                Row(verticalAlignment = Alignment.CenterVertically){
                                    AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSKsUEgwtViD44DclyOLQVxGEPE-J-VZlDPYQ&usqp=CAU").build(), contentDescription = "", modifier = Modifier.weight(0.25f))
                                    Text(text = "Smile", modifier = Modifier.weight(0.75f))
                                }
                            }
                        }
                        AsyncImage(model = ImageRequest.Builder(LocalContext.current).data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22").build(), contentDescription = "", modifier = Modifier
                            .weight(0.25f)
                            .clip(
                                CircleShape
                            ))
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearningAppTheme {
        Greeting("Android")
    }
}