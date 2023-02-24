package com.example.androidrecipes.compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.androidrecipes.compose.heritages.HeritageDetailScreen
import com.example.androidrecipes.compose.heritages.HeritageListScreen
import com.example.androidrecipes.compose.home.HomeScreen

@Composable
fun RecipesApp(
    // テスト時にモック化できるように、引数として受け取る
    navController: NavHostController = rememberNavController(),
    startDestination: String = "home"
) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable("home") {
            HomeScreen(
                navigateToHeritageList = {navController.navigate("heritage_list")}
            )
        }
        composable("heritage_list") {
            HeritageListScreen(
                navigateToHeritageDetail = {
                    navController.navigate("heritage_detail/$it")
                }
            )
        }
        composable(
            "heritage_detail/{heritageId}",
            arguments = listOf(navArgument("heritageId") { type = NavType.IntType })
        ) { backStackEntry ->
            val arguments = requireNotNull(backStackEntry.arguments)
            HeritageDetailScreen(
                heritageId = arguments.getInt("heritageId")
            )
        }
//        val uri = "https://androidrecipes.com"
//        composable(
//            "heritage_detail?heritageId={heritageId}",
//            deepLinks = listOf(navDeepLink { uriPattern = "$uri/{heritageId}" })
//        ) { backStackEntry ->
//            HeritageDetail(
//                navController,
//                backStackEntry.arguments?.getInt("heritageId") ?: 0
//            )
//        }
    }
}