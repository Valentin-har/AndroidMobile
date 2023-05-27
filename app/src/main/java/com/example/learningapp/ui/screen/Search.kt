package com.example.learningapp.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.learningapp.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search() {
    val list = listOf<Color>(
        Color(0xFFE13301),
        Color(0xFF7358ff),
        Color(0xFF1e3264),
        Color(0xFFea115f),
        Color(0xFFbe5901),
        Color(0xFF158807),
        Color(0xFF212e74),
        Color(0xFF27856a),
        Color(0xFFce1283),
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Rechercher", color = MaterialTheme.colorScheme.onPrimary) },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    titleContentColor = MaterialTheme.colorScheme.primary,
                    containerColor = MaterialTheme.colorScheme.primary,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimary
                ),
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_photo),
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
                    icon = {
                        Icon(
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
                    icon = {
                        Icon(
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
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_library),
                            contentDescription = "",
                        )
                    })
            }
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .padding(10.dp, 10.dp)
        ) {
            TextField(modifier = Modifier
                .padding(0.dp, 10.dp)
                .fillMaxWidth(),
                value = "",
                onValueChange = {
                },
                placeholder = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = "",
                    )
                    Text(
                        text = "Que souhaitez-vous écouter ?",
                        modifier = Modifier.padding(30.dp, 0.dp)
                    )
                })
            Text(text = "Parcourir tout", modifier = Modifier.padding(0.dp, 5.dp))
            Row(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .offset(20.dp, 20.dp)
                                .rotate(30f)
                                .size(100.dp)
                                .clip(
                                    RoundedCornerShape(10.dp)
                                )
                        )
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.weight(0.4f).fillMaxHeight()){
                            AsyncImage(
                                model = ImageRequest.Builder(LocalContext.current)
                                    .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                    .build(),
                                contentDescription = "",
                                modifier = Modifier
                                    .padding(start = 20.dp)
                                    .rotate(30f)
                                    .aspectRatio(1f)
                                    .clip(
                                        RoundedCornerShape(12.dp)
                                    ),
                                contentScale = ContentScale.Crop

                            )
                        }

                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(20.dp)
                                )
                        )
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(containerColor = list.random()),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .padding(end = 10.dp)
                ) {
                    Row(modifier = Modifier.fillMaxHeight()) {
                        Text(
                            text = "Flower",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(0.6f)
                                .padding(start = 10.dp, top = 10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.aquaportail.com/pictures1106/phones/anemone-clown_1307889811-fleur.jpg%22")
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .weight(0.4f)
                                .align(
                                    Alignment.Bottom
                                )
                                .padding(start = 20.dp)
                                .rotate(30f)
                                .width(100.dp)
                                .height(100.dp)
                                .clip(
                                    RoundedCornerShape(12.dp)
                                )
                        )
                    }
                }
            }
        }
    }
}