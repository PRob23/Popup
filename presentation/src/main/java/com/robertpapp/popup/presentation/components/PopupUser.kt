package com.robertpapp.popup.presentation.components

import com.robertpapp.popup.domain.model.PopupResult

interface PopupUser {

    fun onPopupResult(result: PopupResult)
}