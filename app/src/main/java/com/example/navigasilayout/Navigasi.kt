package com.example.navigasilayout

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier

enum class Navigasi {
    Formulirku,
    Detail
}

@Composable
fun DateApp(
    navController: NavHostController = rememberNavController(),
    modifier : Modifier
){
    Scaffold{ isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,

            modifier
        )

    }
}