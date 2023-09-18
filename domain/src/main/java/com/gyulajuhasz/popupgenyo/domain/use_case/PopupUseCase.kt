package com.gyulajuhasz.popupgenyo.domain.use_case

import com.gyulajuhasz.popupgenyo.domain.model.PopupResult
import com.gyulajuhasz.popupgenyo.domain.service.PopupService

class PopupUseCase(
    private val popupService: PopupService
) {

    suspend operator fun invoke(): PopupResult =
        popupService.showPopupForResult()
}
