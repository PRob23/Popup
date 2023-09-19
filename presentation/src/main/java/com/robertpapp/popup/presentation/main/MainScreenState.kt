package com.robertpapp.popup.presentation.main

import com.robertpapp.popup.domain.model.PopupResult

data class MainScreenState(
    val popupResult: PopupResult? = null,
    val isButtonEnabled: Boolean = true
)
