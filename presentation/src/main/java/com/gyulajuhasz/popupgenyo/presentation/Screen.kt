package com.gyulajuhasz.popupgenyo.presentation

sealed interface Screen {

    val route: String

    object MainScreen : Screen {
        override val route: String = "main_screen"
    }
}
