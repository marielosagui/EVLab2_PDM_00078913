package com.labo.evaluacion2.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.labo.evaluacion2.R
import com.labo.evaluacion2.Fragmentos.dynamicFragment
import com.labo.evaluacion2.Fragmentos.staticFragment

class MainActivity : AppCompatActivity(), staticFragment.ButtonListener {

    private lateinit var dynamic_fragment: dynamicFragment
    private val imagesId: IntArray = intArrayOf(R.drawable.piedra, R.drawable.piedra2)
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeFragment(dynamicFragment.newInstance(imagesId[0]))
    }


    override fun previousListener(v: View) {
        dynamic_fragment = dynamicFragment.newInstance(verifyCounter(1))
        changeFragment(dynamic_fragment)
    }

    override fun nextListener(v: View) {
        dynamic_fragment = dynamicFragment.newInstance(verifyCounter(2))
        changeFragment(dynamic_fragment)
    }

    private fun verifyCounter(i: Int): Int{
        return when (i) {
            1 -> {
                counter--
                if(counter<0) counter = 2
                imagesId[counter]
            }
            else -> {
                counter++
                if(counter>2) counter = 0
                imagesId[counter]
            }
        }
    }

    private fun changeFragment(frag: dynamicFragment){
        supportFragmentManager.beginTransaction().replace(R.id.dynamic_fragment_container, frag).commit()
    }

}
