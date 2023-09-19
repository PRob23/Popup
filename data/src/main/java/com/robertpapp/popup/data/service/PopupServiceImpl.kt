package com.robertpapp.popup.data.service

import android.app.Activity
import android.app.AlertDialog
import com.robertpapp.popup.domain.model.PopupResult
import com.robertpapp.popup.domain.PopupService
import kotlinx.coroutines.suspendCancellableCoroutine
import javax.inject.Inject
import kotlin.coroutines.resume

class PopupServiceImpl
@Inject internal constructor(
    private val activity: Activity
) : PopupService {
    override suspend fun showPopupForResult(): PopupResult =
        suspendCancellableCoroutine { continuation ->
            AlertDialog.Builder(activity)
                .setTitle("POPUP")
                .setMessage("Choose your destiny!")
                .setOnCancelListener { continuation.resume(PopupResult.NOT_OK) }
                .setPositiveButton("COOL") { _, _ -> continuation.resume(PopupResult.OK) }
                .setNegativeButton("GENYO") { _, _ -> continuation.resume(PopupResult.NOT_OK) }
                .show()
        }
}