package com.rebound.ui.main

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rebound.util.DummyData
import com.rebound.ui.components.ItemCard

@Composable
fun MainScreen(onItemClick: (String) -> Unit) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        DummyData.itemList.forEach { item ->
            ItemCard(item = item) {
                onItemClick(item.id.toString())
            }
        }
    }
}