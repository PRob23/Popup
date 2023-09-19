package com.gyulajuhasz.popupgenyo.domain.service

import android.app.Activity
import com.gyulajuhasz.popupgenyo.domain.model.PopupResult

interface PopupService {

    suspend fun showPopupForResult(activity: Activity): PopupResult
}