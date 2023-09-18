package com.gyulajuhasz.popupgenyo.data.di

import com.gyulajuhasz.popupgenyo.data.service.PopupServiceImpl
import com.gyulajuhasz.popupgenyo.domain.service.PopupService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface PopupModule {

    @Binds
    fun bindPopupService(service: PopupServiceImpl): PopupService
}
