package com.gyulajuhasz.popupgenyo.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gyulajuhasz.popupgenyo.presentation.main.MainScreen
import com.gyulajuhasz.popupgenyo.presentation.main.MainScreenViewModel
import com.gyulajuhasz.popupgenyo.presentation.theme.PopupGenyoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PopupGenyoTheme(darkTheme = true) {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
                        composable(
                            route = Screen.MainScreen.route
                        ) {
                            val viewModel: MainScreenViewModel = hiltViewModel()

                            MainScreen(
                                state = viewModel.state.value,
                                onTestButtonClicked = viewModel::testPopup
                            )
                        }
                    }
                }
            }
        }
    }
}
