package com.dicoding.tourismapp.di

import com.dicoding.tourismapp.core.di.CoreComponent
import com.dicoding.tourismapp.detail.DetailTourismActivity
import com.dicoding.tourismapp.favorite.FavoriteFragment
import com.dicoding.tourismapp.home.HomeFragment
import dagger.Component

@AppScope // define scope to Application
@Component(
    dependencies = [CoreComponent::class], // enable 'AppComponent' to access `CoreComponent`
    modules = [AppModule::class]) //  module that is needed in this `AppComponent`
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent // create `AppComponent` instance with `CoreComponent` as dependency
    }

    // function to choose which classes can access the dependencies
    fun inject(fragment: HomeFragment)
    fun inject(fragment: FavoriteFragment)
    fun inject(activity: DetailTourismActivity)

}