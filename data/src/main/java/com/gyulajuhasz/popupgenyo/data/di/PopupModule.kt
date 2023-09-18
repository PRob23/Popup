package com.gyulajuhasz.popupgenyo.data.di

import android.app.Activity
import com.gyulajuhasz.popupgenyo.data.service.PopupServiceImpl
import com.gyulajuhasz.popupgenyo.domain.service.PopupService
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
object PopupModule {

    @Provides
    @ActivityScoped
    fun provide(
        activity: Activity
    ): PopupService = PopupServiceImpl(
        activity
    )
}
