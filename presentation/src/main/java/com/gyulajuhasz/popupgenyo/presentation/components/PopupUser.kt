package com.gyulajuhasz.popupgenyo.presentation.components

import com.gyulajuhasz.popupgenyo.domain.model.PopupResult

interface PopupUser {

    fun onPopupResult(result: PopupResult)
}