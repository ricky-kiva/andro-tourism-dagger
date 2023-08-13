package com.dicoding.tourismapp.core.di

import com.dicoding.tourismapp.core.data.TourismRepository
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module

// this `includes` indicates that RepositoryModule depends on `NetworkModule` & `DatabaseModule`
@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class RepositoryModule {

    @Binds // `@Binds` to provide implementation of `Interface`. for this, it provides `ITourismRepository` for `TourismRepository` implementation
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository

}