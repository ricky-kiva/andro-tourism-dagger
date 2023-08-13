package com.dicoding.tourismapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp // enable Application scope class injection by Hilt
open class MyApplication: Application() {

    /* Dagger without Hilt
    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(applicationContext)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(coreComponent)
    }*/

}