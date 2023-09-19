package com.robertpapp.popup.presentation.main

import android.app.Activity
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.robertpapp.popup.domain.model.PopupResult
import com.robertpapp.popup.domain.use_case.PopupUseCase
import com.robertpapp.popup.presentation.components.PopupUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel
@Inject constructor(private val popupUseCase: PopupUseCase) : ViewModel() {

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
