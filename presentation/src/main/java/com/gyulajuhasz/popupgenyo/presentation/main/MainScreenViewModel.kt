package com.gyulajuhasz.popupgenyo.presentation.main

import android.app.Activity
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gyulajuhasz.popupgenyo.domain.model.PopupResult
import com.gyulajuhasz.popupgenyo.domain.use_case.PopupUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel
@Inject constructor(
    private val popupUseCase: PopupUseCase
) : ViewModel() {

    private val _state = mutableStateOf(MainScreenState(popupResult = null))
    val state: State<MainScreenState> = _state

    fun testPopup(activity: Activity?) {
        viewModelScope.launch {
            _state.value = MainScreenState(isButtonEnabled = false)
            _state.value = activity?.let {
                MainScreenState(popupResult = popupUseCase(activity))
            } ?: MainScreenState(popupResult = PopupResult.OK)
        }
    }
}
