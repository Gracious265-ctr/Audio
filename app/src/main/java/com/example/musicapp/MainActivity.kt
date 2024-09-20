package com.example.musicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.Songs.Bttns
import com.example.musicapp.Songs.Buttons
import com.example.musicapp.Songs.MySongs
import com.example.musicapp.Songs.Sl
import com.example.musicapp.ui.components.Song
import com.example.musicapp.ui.theme.MusicAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


            }
        }


    }



@Composable
fun Songlist(songs: List<MySongs>){
    LazyColumn  {
        items(songs){item ->
            Song(item)
        }
    }
}


@Composable
fun ShowList() {
    Scaffold(

        topBar = {
            NavigationBar {
                Row(horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth().padding(top = 40.dp)) {
                   Row {
                        Image(
                            painter = painterResource(R.drawable.music__1_),contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.size(50.dp)
                        )
                       Text(
                           text = "AudioVibes",
                           fontWeight = FontWeight.Bold,
                           color = Color.Blue,
                           fontStyle = FontStyle.Italic,
                           fontFamily = FontFamily.Serif,
                           modifier = Modifier.padding(top = 10.dp)

                       )
                    }
                    Icon(imageVector = Icons.Filled.AccountCircle,contentDescription = null,
                        modifier = Modifier.padding(horizontal = 45.dp))
                    Icon(painter = painterResource(id = R.drawable.menu),contentDescription = null,
                        modifier = Modifier.padding(horizontal = 45.dp)
                    )
                }
            }
        },
        bottomBar = {
            NavigationBar {
                Row(horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()) {
                    Icon(imageVector = Icons.Filled.Home,contentDescription = null,
                        modifier = Modifier.padding(horizontal = 45.dp))
                    Icon(painter = painterResource(id = R.drawable.playlist),
                        contentDescription = null,
                        modifier = Modifier.padding(horizontal = 45.dp))
                    Icon(imageVector = Icons.Filled.Settings,contentDescription = null,
                        modifier = Modifier.padding(horizontal = 45.dp)
                    )
                }
            }
        }

    ) {innerPadding ->

        Column(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
                        Bttns()
                        Spacer(modifier = Modifier.height(30.dp))
                        Sl()
        }
    }

}


@Preview(showBackground = true, showSystemUi = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun PreviewList(){
    ShowList()
}
