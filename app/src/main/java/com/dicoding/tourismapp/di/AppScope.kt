package com.dicoding.tourismapp.di

import javax.inject.Scope

@Scope // `@Scope` means this `annotation` meant to define "scope"
@Retention(AnnotationRetention.RUNTIME) // `RUNTIME` ensure this `annotation` is "retained" & "accessible" on "runtime"
annotation class AppScope // `annotation` is special markers that provides additional info to compiler/runtime environment