package io.linlangli.imoney.view.activity

import com.linlangli.pangtouyu.view.activity.BaseActivity
import io.linlangli.imoney.R
import io.linlangli.imoney.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun layoutId(): Int = R.layout.activity_main

    override fun initVM() {
    }

    override fun iniView() {
    }

    override fun iniData() {
    }

    override fun navControllerId() = R.id.activity_nav_main

}