package com.rebound

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.rebound.ui.components.ItemCard
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
        LazyColumn {
            items(items) { item ->
                ItemCard(item = item)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ReboundAppPreview() {
    ReboundApp()
}