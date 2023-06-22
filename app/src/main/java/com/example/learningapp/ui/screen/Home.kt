package com.example.learningapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learningapp.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(){

    val navController = rememberNavController();
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
                    IconButton(onClick = {

                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_notification),
                            contentDescription = ""
                        )
                    }
                    IconButton(onClick = {
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_history),
                            contentDescription = ""
                        )
                    }
                    IconButton(onClick = {
                    }) {
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
                    onClick = {
                        navController.navigate("home")
                    },
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
                    onClick = {
                        navController.navigate("search")
                    },
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
                    onClick = {
                        navController.navigate("library")
                    },
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
        NavHost(navController = navController, startDestination ="home", modifier = Modifier.padding(it)) {
            composable("home") {
                Main()
            }
            composable("search") {
                Search()
            }
            composable("library") {
                Text(text="Je suis la library" , Modifier.background(Color.White));
            }
            composable("login") {
                SignUp()
            }
        }
    }
}