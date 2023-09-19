package com.gyulajuhasz.popupgenyo.domain.use_case

import android.app.Activity
import com.gyulajuhasz.popupgenyo.domain.model.PopupResult
import com.gyulajuhasz.popupgenyo.domain.service.PopupService

class PopupUseCase(
    private val popupService: PopupService
) {

    suspend operator fun invoke(activity: Activity): PopupResult =
        popupService.showPopupForResult(activity)
}
