package com.gyulajuhasz.popupgenyo.domain.use_case

import com.gyulajuhasz.popupgenyo.domain.model.PopupResult

class PopupUseCase() {

    suspend operator fun invoke(): PopupResult =
        PopupResult.NOT_OK
}
