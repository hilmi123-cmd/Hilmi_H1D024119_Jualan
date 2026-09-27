package com.pemmob.HilmiH1D024119

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pemmob.HilmiH1D024119.ui.screen.DaftarProdukScreen
import com.pemmob.HilmiH1D024119.ui.screen.DetailProductScreen
import com.pemmob.HilmiH1D024119.ui.screen.HubungiKamiScreen
import com.pemmob.HilmiH1D024119.ui.theme.JualanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JualanTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "daftar_produk"
                ) {
                    // 1. Rute Halaman Daftar Produk
                    composable(route = "daftar_produk") {
                        DaftarProdukScreen(navController = navController)
                    }

                    // 2. Rute Halaman Detail Produk (Membawa Argumen productId)
                    composable(
                        route = "detail/{productId}",
                        arguments = listOf(navArgument("productId") {
                            type = NavType.IntType
                        })
                    ) { backStackEntry ->
                        val productId = backStackEntry.arguments?.getInt("productId") ?: 0
                        DetailProductScreen(
                            productId = productId,
                            navController = navController
                        )
                    }

                    // 3. Rute Halaman Hubungi Kami
                    composable(route = "hubungi_kami") {
                        HubungiKamiScreen(navController = navController)
                    }
                }
            }
        }
    }
}
