package com.markshipton.daggermvvm.app.feature.home

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.markshipton.daggermvvm.R
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_name.*
import javax.inject.Inject

class NameFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory : ViewModelProvider.Factory

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onActivityCreated(savedInstanceState)

        val viewModel = ViewModelProviders.of(activity, viewModelFactory).get(HomeViewModel::class.java)
        viewModel.name.observe(this,  Observer { nameTextView?.text = it })
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_name, container, false)
    }
}