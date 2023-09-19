package com.robertpapp.popup.data

import com.robertpapp.popup.data.service.PopupServiceImpl
import com.robertpapp.popup.domain.PopupService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
interface PopupModule {

    @Binds
    fun bindPopupService(service: PopupServiceImpl): PopupService
}
