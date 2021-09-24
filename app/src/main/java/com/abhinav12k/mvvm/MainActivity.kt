package com.abhinav12k.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhinav12k.common.base.BaseActivity
import com.abhinav12k.mvvm.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun create(savedInstanceState: Bundle?) {
        //Initialize content + views here
    }
}