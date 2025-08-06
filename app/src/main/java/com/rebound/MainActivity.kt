package com.rebound

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.rebound.util.DummyData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReboundApp()
        }
    }
}

@Composable
fun ReboundApp() {
    val items = DummyData.itemList

    MaterialTheme {
        Column {
            for (item in items) {
                Text(text = "${item.title}: ${item.description}")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ReboundAppPreview() {
    ReboundApp()
}