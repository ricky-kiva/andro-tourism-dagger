package com.dicoding.tourismapp.core.di

import android.content.Context
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class]) // module that is needed in this `CoreComponent`
interface CoreComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): CoreComponent // provide `Context` to all needing classes
    }

    fun provideRepository(): ITourismRepository // function to provide repository

}