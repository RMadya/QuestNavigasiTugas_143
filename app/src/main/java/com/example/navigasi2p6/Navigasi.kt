package com.example.navigasi2p6


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


enum class NavigationRoute {
    Welcome,
    Detail,
    Formulir
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = NavigationRoute.Welcome.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            // Welcome
            composable(NavigationRoute.Welcome.name) {
                WelcomeScreen(
                    onSubmitClick = {
                        // ke Detail / TampilData
                        navController.navigate(NavigationRoute.Detail.name) {
                            // hindari duplikat di top
                            launchSingleTop = true
                        }
                    }
                )
            }

            // Tampil Data (Detail)
            composable(NavigationRoute.Detail.name) {
                TampilData(
                    onHomeClick = {
                        // kembali ke Welcome, bersihkan stack agar tidak double
                        navController.navigate(NavigationRoute.Welcome.name) {
                            popUpTo(NavigationRoute.Welcome.name) { inclusive = true }
                            launchSingleTop = true
                        }
                    },
                    onFormClick = {
                        // buka Formulir
                        navController.navigate(NavigationRoute.Formulir.name) {
                            launchSingleTop = true
                        }
                    }
                )
            }

            // Formulir
            composable(NavigationRoute.Formulir.name) {
                // NOTE: FormDataDiriStyled signature: (modifier: Modifier = Modifier, onBackClick: () -> Unit)
                FormDataDiriStyled(
                    onBackClick = {
                        // kembali ke Detail (TampilData)
                        navController.navigate(NavigationRoute.Detail.name) {
                            // jika mau, hapus Formulir dari backstack:
                            popUpTo(NavigationRoute.Detail.name) { inclusive = true }
                            launchSingleTop = true
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun TampilData(onHomeClick: () -> Unit, onFormClick: () -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun WelcomeScreen(onSubmitClick: () -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun FormDataDiriStyled(onBackClick: () -> Unit) {
    TODO("Not yet implemented")
}
