package com.gyulajuhasz.popupgenyo.data.di

import com.gyulajuhasz.popupgenyo.domain.use_case.PopupUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    fun providePopupUseCase(): PopupUseCase = PopupUseCase()
}
