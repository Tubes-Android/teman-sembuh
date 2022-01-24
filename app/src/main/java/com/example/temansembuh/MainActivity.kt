package com.example.temansembuh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.temansembuh.ui.theme.TemanSembuhTheme
import com.example.temansembuh.ui.theme.primaryColor
import com.example.temansembuh.ui.theme.textColor
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TemanSembuhTheme {
                MainScreen()
            }
        }
    }
}


@Composable
fun Greeting() {
    Text(
        "hallo Android",
        color = primaryColor
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TemanSembuhTheme {
        Greeting()
    }
}