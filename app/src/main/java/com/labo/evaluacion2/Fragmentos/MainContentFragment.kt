package com.labo.evaluacion2.Fragmentos


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*


class MainContentFragment: Fragment() {

    var Fragmento = ()

    companion object {
        fun newInstance(Fragmento:fragmento): MainContentFragment{
            val newFragment = MainContentFragment()
            newFragment.Fragmento = Fragmento
            return newFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.main_content_fragment_layout, container, false)

        bindData(view)

        return view
    }

    fun bindData(view: View){
    }

}