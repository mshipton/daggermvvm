package com.markshipton.daggermvvm.app.di

import com.markshipton.daggermvvm.app.feature.home.HomeActivity
import com.markshipton.daggermvvm.app.feature.home.HomeModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Used by Android Injector to automatically create sub-components so we can inject into Activities listed here.
 */
@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun homeActivity(): HomeActivity
}