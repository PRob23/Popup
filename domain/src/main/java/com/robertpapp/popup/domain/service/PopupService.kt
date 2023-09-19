package com.robertpapp.popup.domain.service

import android.app.Activity
import com.robertpapp.popup.domain.model.PopupResult

interface PopupService {

    suspend fun showPopupForResult(activity: Activity): PopupResult
}