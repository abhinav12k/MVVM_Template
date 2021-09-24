package com.abhinav12k.common.base

import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

/**
 * Created by abhinav on 24/09/21.
 */
abstract class VMBaseActivity<VM: ViewModel,VB: ViewBinding>: BaseActivity<VB>() {

    lateinit var viewModel: VM

    final override fun create(savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(this).get(getViewModelClass())
        onCreate(savedInstanceState,viewModel,binding)
    }

    protected abstract fun getViewModelClass(): Class<VM>
    protected abstract fun onCreate(savedInstanceState: Bundle?, viewModel: ViewModel, binding: ViewBinding)
}