package com.markshipton.daggermvvm.app.di

import android.content.Context
import com.markshipton.daggermvvm.app.DaggerMvvmApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            ActivityBindingModule::class,
            AndroidSupportInjectionModule::class,
            ViewModelModule::class,
            RepositoryModule::class
        ]
)
interface ApplicationComponent : AndroidInjector<DaggerMvvmApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder
        fun build(): ApplicationComponent
    }
}

