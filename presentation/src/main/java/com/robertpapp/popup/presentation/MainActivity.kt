package com.robertpapp.popup.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.robertpapp.popup.presentation.components.PopupUser
import com.robertpapp.popup.domain.PopupService
import com.robertpapp.popup.presentation.main.MainScreen
import com.robertpapp.popup.presentation.main.MainScreenViewModel
import com.robertpapp.popup.presentation.theme.PopupGenyoTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var popupService: PopupService

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
                                onTestButtonClicked = {
                                    showPopupForResult(viewModel)
                                }
                            )
                        }
                    }
                }
            }
        }
    }

    private fun showPopupForResult(popupUser: PopupUser) {
        lifecycleScope.launch {
            popupUser.onPopupResult(popupService.showPopupForResult())
        }
    }
}
