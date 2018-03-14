package com.markshipton.daggermvvm.app.di

import com.markshipton.daggermvvm.data.repository.RandomNameRepository
import com.markshipton.daggermvvm.domain.repository.NameRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Provides all concrete implementations of repositories.
 */
@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun nameRepository() : NameRepository = RandomNameRepository()
}