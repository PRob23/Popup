package com.robertpapp.popup.data.di

import com.robertpapp.popup.data.service.PopupServiceImpl
import com.robertpapp.popup.domain.service.PopupService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ActivityComponent::class)
interface PopupModule {

    @Binds
    fun bindPopupService(service: PopupServiceImpl): PopupService
}
