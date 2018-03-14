package com.markshipton.daggermvvm.data.repository

import com.markshipton.daggermvvm.domain.repository.NameRepository

class RandomNameRepository :  NameRepository {

    val names = listOf("Anna", "K", "Mark", "Michael", "Rakesh", "Roxana")

    override fun getName(): String {
        return names[(Math.random() * names.size).toInt()]
    }
}