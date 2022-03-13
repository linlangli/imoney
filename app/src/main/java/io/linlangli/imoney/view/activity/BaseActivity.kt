package io.linlangli.imoney.view.activity


import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import io.linlangli.imoney.viewmodel.BaseViewModel

abstract class BaseActivity<DB : ViewDataBinding> : AppCompatActivity() {

    lateinit var binder: DB

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = DataBindingUtil.setContentView(this, layoutId())
        setContentView(binder.root)
        val navControllerId = navControllerId()
        if (navControllerId != -1) {
            navController = findNavController(this, navControllerId())
        }
        initVM()
        iniData()
        iniView()
    }

    abstract fun layoutId() : Int

    abstract fun initVM()

    abstract fun iniView()

    abstract fun iniData()

    abstract fun navControllerId() : Int

    fun nav(id : Int){
        try {
            navController.navigate(id)
        } catch (ignore:Exception) {}
    }

    fun <T : BaseViewModel> getVM(clazz : Class<T>) : T
            = ViewModelProvider(this).get(clazz)

    fun addToolBar(toolbar: ViewGroup?) {
        toolbar?.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        val view = binder.root
        if(view is ViewGroup) {
            view.addView(toolbar)
        }
    }
}