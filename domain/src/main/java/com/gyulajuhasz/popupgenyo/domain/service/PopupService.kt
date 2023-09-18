package com.gyulajuhasz.popupgenyo.domain.service

import com.gyulajuhasz.popupgenyo.domain.model.PopupResult

interface PopupService {

    suspend fun showPopupForResult(): PopupResult
}