package com.dicoding.tourismapp.core.di

import android.content.Context
import androidx.room.Room
import com.dicoding.tourismapp.core.data.source.local.room.TourismDao
import com.dicoding.tourismapp.core.data.source.local.room.TourismDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // decide which Hilt `Component` to use this module, which is "SingletonComponent"
// use `SingletonComponent` because it's the highest hierarchy, which could be placed anywhere
class DatabaseModule {

    // use `@ApplicationContext` to get `Context`
    @Singleton
    @Provides // use `@Provides` when the 'class is from "third-party" dependencies
    fun provideDatabase(@ApplicationContext context: Context): TourismDatabase = Room.databaseBuilder(
        context, TourismDatabase::class.java, "Tourism.db"
    ).fallbackToDestructiveMigration().build()

    @Provides
    fun provideTourismDao(database: TourismDatabase): TourismDao = database.tourismDao()

}