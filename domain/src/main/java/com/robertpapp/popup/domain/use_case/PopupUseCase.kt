package com.robertpapp.popup.domain.use_case

import android.app.Activity
import com.robertpapp.popup.domain.model.PopupResult
import com.robertpapp.popup.domain.service.PopupService

class PopupUseCase(
    private val popupService: PopupService
) {

    suspend operator fun invoke(activity: Activity): PopupResult =
        popupService.showPopupForResult(activity)
}
