package com.robertpapp.popup.domain.service

import com.robertpapp.popup.domain.model.PopupResult

interface PopupService {

    suspend fun showPopupForResult(): PopupResult
}