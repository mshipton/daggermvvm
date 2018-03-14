package com.markshipton.daggermvvm.app

import com.markshipton.daggermvvm.app.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class DaggerMvvmApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder()
                .context(this)
                .build()
    }
}