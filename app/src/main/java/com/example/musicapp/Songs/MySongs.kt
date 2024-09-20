package com.example.musicapp.Songs

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.musicapp.R
import com.example.musicapp.Songlist
import com.example.musicapp.ui.components.Song

data class MySongs(

    @DrawableRes val artwork : Int,
    @StringRes val title : Int,
    @StringRes val name : Int,
    @StringRes val genre : Int,

)
data class Buttons(
    @DrawableRes val icons: Int,
    @StringRes val txt : Int
)
@Composable
fun Sl(){
    val listSongs = listOf(
        MySongs(
            artwork = R.drawable.img7,
            title = R.string.dont_worry_be_happy,
            name = R.string.bobby,
            genre = R.string.afropop,

        ), MySongs(
            artwork = R.drawable.mg2,
            title = R.string.dance,
            name = R.string.jack,
            genre = R.string.afropop,

        ),MySongs(
            artwork = R.drawable.mg3,
            title = R.string.i_will_be_there,
            name = R.string.john,
            genre =R.string.hiphop,

        ),MySongs(
            artwork = R.drawable.mg4,
            title = R.string.legends,
            name = R.string.dan,
            genre = R.string.hiphop

        ),MySongs(
            artwork = R.drawable.mg5,
            title = R.string.together,
            name = R.string.bobby,
            genre = R.string.afropop,

        ),MySongs(
            artwork = R.drawable.mg6,
            title = R.string.dont_worry_be_happy,
            name = R.string.bobby,
            genre = R.string.hiphop

        ),MySongs(
            artwork = R.drawable.mg2,
            title = R.string.dont_worry_be_happy,
            name = R.string.bobby,
            genre = R.string.afropop,

        ),MySongs(
            artwork = R.drawable.img7,
            title = R.string.together,
            name = R.string.bobby,
            genre = R.string.afropop,

        ),

    )
    Songlist(listSongs)
}
@Composable
fun diplay(btn: List<Buttons>){

   LazyRow {
       items(btn){item ->
           Column (
               horizontalAlignment = Alignment.CenterHorizontally,
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(horizontal = 40.dp, vertical = 20.dp)
           ){
               Icon(
                   painterResource(id = item.icons),
                   contentDescription = null,
                   modifier = Modifier.size(30.dp)
                   )
               Text(text = LocalContext.current.getString(item.txt),
                   fontWeight = FontWeight.Bold
               )
           }
       }
   }
}
@Composable
fun Bttns(){

  val listBttns= listOf(
      Buttons(
          icons =R.drawable.treng,
          txt = R.string.trending
      ),Buttons(
          icons = R.drawable.fava,
          txt = R.string.favorites

      ),Buttons(
          icons = R.drawable.search,
          txt = R.string.search

      ),Buttons(
          icons = R.drawable.album,
          txt = R.string.albums

      ),Buttons(
          icons = R.drawable.recent,
          txt = R.string.recents
      ),Buttons(
          icons = R.drawable.genre,
          txt = R.string.genres

      )
  )
    diplay(listBttns)

}