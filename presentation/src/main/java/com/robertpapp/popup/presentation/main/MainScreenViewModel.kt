package com.robertpapp.popup.presentation.main

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.robertpapp.popup.domain.model.PopupResult
import com.robertpapp.popup.presentation.components.PopupUser
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel
@Inject constructor() : ViewModel(), PopupUser {

    private val _state = mutableStateOf(MainScreenState(popupResult = null))
    val state: State<MainScreenState> = _state

    override fun onPopupResult(result: PopupResult) {
        _state.value = MainScreenState(popupResult = result)
    }
}
