package com.gyulajuhasz.popupgenyo.data.service

import android.app.Activity
import com.gyulajuhasz.popupgenyo.domain.model.PopupResult
import com.gyulajuhasz.popupgenyo.domain.service.PopupService
import kotlinx.coroutines.delay
import javax.inject.Inject

class PopupServiceImpl
@Inject internal constructor(): PopupService {
    override suspend fun showPopupForResult(activity: Activity): PopupResult {
        delay(1000)
        return PopupResult.OK
    }
}