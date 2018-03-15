package com.example.christian.appanimation

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    data class monstruosCazados(var contador: Int)

    companion object {
        var datoss = monstruosCazados(0)

        fun cambiarCont(i: Int){
            datoss = monstruosCazados(i)
        }

        fun darCont(): Int {
            return datoss.contador
        }
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(datoss.contador.toString())

                addFragment(FragmentHome.Companion.newInstance(datoss.contador.toString()))
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                message.setText(datoss.contador.toString())

                addFragment(FragmentDashboard.Companion.newInstance(datoss.contador.toString()))
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.abc_fade_in, R.anim.abc_fade_out)
                .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
                .addToBackStack(fragment.javaClass.getSimpleName())
                .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        addFragment(FragmentHome.Companion.newInstance(""))
    }
}
