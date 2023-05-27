package com.example.learningapp.ui.component
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.learningapp.R

@Composable
fun CategoryCard(
    modifier: Modifier,
    cardColor: Color,
    cardText: String
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = cardColor),
        modifier = modifier
    ) {
        Row(modifier = Modifier.fillMaxHeight()) {
            Text(
                text = cardText,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .weight(0.6f)
                    .padding(start = 10.dp, top = 10.dp)
            )
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxHeight()
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(R.drawable.apple_music_note)
                        .build(),
                    contentDescription = "",
                    modifier = Modifier
                        .rotate(30f)
                        .size(60.dp)
                        .graphicsLayer { translationX = 25f }
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
