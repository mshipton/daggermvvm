package com.markshipton.daggermvvm.app.feature.home

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeModule {

    @ContributesAndroidInjector()
    abstract fun nameFragment(): NameFragment

    @ContributesAndroidInjector()
    abstract fun reversedNameFragment(): ReversedNameFragment
}