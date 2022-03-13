package io.linlangli.imoney.view.activity

import io.linlangli.imoney.R
import io.linlangli.imoney.databinding.ActivityMainBinding
import io.linlangli.imoney.view.widget.TopBar
import io.linlangli.imoney.view.widget.TopBar.IBtnListOrChart
import io.linlangli.imoney.view.widget.TopBar.IBtnShare
import io.linlangli.imoney.view.widget.TopBar.IBtnRobot

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun layoutId(): Int = R.layout.activity_main

    override fun initVM() {
    }

    override fun iniView() {
        TopBar.instant(this)?.initView(
        object : IBtnListOrChart {
            override fun onClick(isChart: Boolean) {
            }
        }, object : IBtnRobot {
            override fun onClick() {
            }
        }, object : IBtnShare {
            override fun onClick() {
            }
        })
        addToolBar(TopBar.instant(this))
    }

    override fun iniData() {
    }

    override fun navControllerId() = R.id.activity_nav_main

}