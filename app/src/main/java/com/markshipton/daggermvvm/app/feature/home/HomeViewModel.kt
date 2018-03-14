package com.markshipton.daggermvvm.app.feature.home

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.markshipton.daggermvvm.domain.interactor.GetName
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val getName: GetName) : ViewModel() {

    val name = MutableLiveData<String>()
    val reversedName = MutableLiveData<String>()

    init {
        updateName()
    }

    fun updateName() {
        val response = getName.execute()
        name.value = response
        reversedName.value = response.reversed()
    }
}
