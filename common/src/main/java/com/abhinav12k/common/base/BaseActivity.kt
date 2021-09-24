package com.abhinav12k.common.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * Created by abhinav on 24/09/21.
 */
abstract class BaseActivity<VB: ViewBinding>: AppCompatActivity() {

    lateinit var binding: VB

    final override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getViewBinding()
        setContentView(binding.root)
        create(savedInstanceState)
    }

    protected abstract fun getViewBinding(): VB
    protected abstract fun create(savedInstanceState: Bundle?)
}