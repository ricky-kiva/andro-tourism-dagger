package com.dicoding.tourismapp.core.di

import com.dicoding.tourismapp.core.data.TourismRepository
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

// this `includes` indicates that RepositoryModule depends on `NetworkModule` & `DatabaseModule`
@Module()
@InstallIn(SingletonComponent::class) // decide which Hilt `Component` to use this module, which is "SingletonComponent"
// use `SingletonComponent` because it's the highest hierarchy, which could be placed anywhere
abstract class RepositoryModule {

    @Binds // `@Binds` to provide implementation of `Interface`. for this, it provides `ITourismRepository` for `TourismRepository` implementation
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository

}