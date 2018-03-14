package com.markshipton.daggermvvm.domain.interactor

import com.markshipton.daggermvvm.domain.repository.NameRepository
import javax.inject.Inject

class GetName @Inject constructor(private val repository: NameRepository) {

    fun execute() : String {
        return repository.getName()
    }
}