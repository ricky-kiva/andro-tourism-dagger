package com.dicoding.tourismapp.di

import com.dicoding.tourismapp.core.domain.usecase.TourismInteractor
import com.dicoding.tourismapp.core.domain.usecase.TourismUseCase
import dagger.Binds

abstract class AppModule {

    @Binds
    abstract fun provideTourismUseCase(tourismInteractor: TourismInteractor): TourismUseCase

}