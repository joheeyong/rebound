package com.rebound.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rebound.ui.detail.DetailScreen
import com.rebound.ui.main.MainScreen

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "main"
    ) {
        composable("main") {
            MainScreen(
                onItemClick = { itemId ->
                    navController.navigate("detail/$itemId")
                }
            )
        }
        composable("detail/{itemId}") { backStackEntry ->
            val itemId = backStackEntry.arguments?.getString("itemId") ?: ""
            DetailScreen(
                itemId = itemId,
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
