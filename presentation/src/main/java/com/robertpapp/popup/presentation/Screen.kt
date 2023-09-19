package com.robertpapp.popup.presentation

sealed interface Screen {

    val route: String

    object MainScreen : Screen {
        override val route: String = "main_screen"
    }
}
