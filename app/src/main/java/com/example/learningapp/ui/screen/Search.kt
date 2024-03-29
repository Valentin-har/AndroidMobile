package com.example.learningapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.learningapp.R
import com.example.learningapp.ui.component.CategoryCard

val colorList = mutableListOf<Color>(
    Color(0xFFE13301),
    Color(0xFF7358ff),
    Color(0xFFea115f),
    Color(0xFFbe5901),
    Color(0xFF158807),
    Color(0xFF212e74),
    Color(0xFF27856a),
    Color(0xFF7b4c32),
    Color(0xFF503651),
    Color(0xFFd9138a),
    Color(0xFFed1d33),
    Color(0xFFa46651),
    Color(0xFF375b6b),
    Color(0xFFd84000),
    Color(0xFF0d73ef),
    Color(0xFF891931),
    Color(0xFFb21147),
)

val categoryTitle = listOf<String>(
    "Podcasts",
    "Événéments live",
    "Conçu spécialement pour vous",
    "Dernières sorties",
    "Hip-Hop",
    "Pop",
    "Été",
    "Classements",
    "Latino",
    "Ambiance",
    "Dance/Électro",
    "Rock",
    "Découvertes",
    "Radio",
    "Indie",
    "Rock"
)

val categoryTitleUsed = mutableListOf<String>()
val colorUsed = mutableListOf<Color>()

fun selectColor(color: MutableList<Color>, colorUsed: MutableList<Color>): Color {
    if (color.size == 0) {
        color.addAll(colorUsed)
        colorUsed.clear()
    }
    val pickedColor = color.random()
    color.remove(pickedColor)
    colorUsed.add(pickedColor)
    return pickedColor
}

fun setCategoryTitle(title: MutableList<String>, titleUsed: MutableList<String>): String {
    if (titleUsed.size == 0) {
        titleUsed.addAll(title)
        return setCategoryTitle(title, titleUsed)
    }else{
        val pickedTitle = titleUsed.random()
        titleUsed.remove(pickedTitle)
        return pickedTitle
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search() {
    val categoryTitleTmp = categoryTitle
    Column(
        modifier = Modifier
            .padding(10.dp, 10.dp)
    ) {
        TextField(modifier = Modifier
            .padding(0.dp, 10.dp)
            .fillMaxWidth(),
            value = "",
            onValueChange = {},
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
        val count = categoryTitle.size / 2
        LazyColumn() {
            items(categoryTitle) {
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp)
                        .fillMaxWidth()
                ) {
                    CategoryCard(
                        cardColor = selectColor(colorList, colorUsed),
                        //cardText = setCategoryTitle(categoryTitle, categoryTitleTmp),
                        cardText = it,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(end = 10.dp)
                            .weight(1f)
                    )
                    CategoryCard(
                        cardColor = selectColor(colorList, colorUsed),
                        //cardText = setCategoryTitle(categoryTitle, categoryTitleTmp),
                        cardText = it,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(end = 10.dp)
                            .weight(1f)
                    )
                }
            }
            /**if (categoryTitle.size % 2 == 1) {
                items(1) {
                    Row(
                        modifier = Modifier
                            .padding(top = 10.dp, bottom = 10.dp)
                    ) {
                        CategoryCard(
                            cardColor = selectColor(colorList, colorUsed),
                            //cardText = setCategoryTitle(categoryTitle, categoryTitleTmp),
                            cardText = it,
                            modifier = Modifier
                                .height(80.dp)
                                .padding(end = 10.dp)
                                .fillMaxWidth(fraction= 0.5f)
                        )
                    }
                }
            }
             */
        }
    }
}