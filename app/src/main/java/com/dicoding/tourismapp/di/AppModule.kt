package com.dicoding.tourismapp.di

import com.dicoding.tourismapp.core.domain.usecase.TourismInteractor
import com.dicoding.tourismapp.core.domain.usecase.TourismUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class) // decide which Hilt `Component` to use this module, which is `ViewModelComponent`
// use `ViewModelComponent` because it only used in ViewModels
abstract class AppModule {

    @Binds
    @ViewModelScoped // set "scope" to `ViewModel`
    abstract fun provideTourismUseCase(tourismInteractor: TourismInteractor): TourismUseCase

}