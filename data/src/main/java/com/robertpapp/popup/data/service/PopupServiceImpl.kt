package com.robertpapp.popup.data.service

import android.app.Activity
import android.app.AlertDialog
import com.robertpapp.popup.domain.model.PopupResult
import com.robertpapp.popup.domain.service.PopupService
import kotlinx.coroutines.delay
import kotlinx.coroutines.suspendCancellableCoroutine
import javax.inject.Inject
import kotlin.coroutines.resume

class PopupServiceImpl
@Inject internal constructor(): PopupService {
    override suspend fun showPopupForResult(activity: Activity): PopupResult {
        delay(1000)
        return PopupResult.OK
    }
}