package com.example.first_compose_app

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
                ListItem(name = "Aslan", prof = "Developer")
            }
        }
    }
}

@Composable
fun ListItem(name: String, prof: String) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .pointerInput(Unit) {
                detectTapGestures {

                    Log.e("ololo", "Long press: $it")
                }
            },
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box() {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.portal_background),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(start = 5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(start = 16.dp)) {
                    Text(text = name)
                    Text(text = prof)
                }
            }
        }
    }
}






