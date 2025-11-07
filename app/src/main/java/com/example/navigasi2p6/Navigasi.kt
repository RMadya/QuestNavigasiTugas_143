package com.example.navigasi2p6


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasi2p6.view.FormDataDiriStyled
import com.example.navigasi2p6.view.TampilData
import com.example.navigasi2p6.view.WelcomeScreen

// 🔹 Enum untuk semua route halaman
enum class Navigation {
    Welcome,
    Detail,
    Formulir
}


//  Fungsi utama untuk navigasi antar layar
@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Navigation.Welcome.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            //  Halaman 1: Welcome Screen
            composable(route = Navigation.Welcome.name) {
                WelcomeScreen(
                    onSubmitClick = {
                        // Dari Welcome → ke TampilData
                        navController.navigate(Navigation.Detail.name)
                    }
                )
            }

            //  Halaman 2: Tampil Data


