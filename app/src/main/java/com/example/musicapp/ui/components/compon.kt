package com.example.musicapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.Songs.Buttons
import com.example.musicapp.Songs.MySongs


@Composable
fun Song(song:MySongs){

    Row(modifier = Modifier.padding(horizontal = 11.dp, vertical = 7.dp).fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(
            painter = painterResource(id = song.artwork),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(90.dp).clip(CircleShape)
        )
        Column(modifier = Modifier.padding(horizontal = 15.dp, vertical = 5.dp )) {
            Text(
                text = LocalContext.current.getString(song.title),
                style = MaterialTheme.typography.titleLarge,
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = LocalContext.current.getString(song.name),
                style = MaterialTheme.typography.titleMedium,


                )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = LocalContext.current.getString(song.genre),
                color = Color.Gray,

                )
            Spacer(modifier = Modifier.height(2.dp))

        }
        Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()){
        Icon(imageVector = Icons.Filled.MoreVert,contentDescription = null)
        }
    }}
