package com.labo.evaluacion2.Fragmentos

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.labo.evaluacion2.R
import kotlinx.android.synthetic.main.estatico_fragment.view.*

class staticFragment: Fragment() {

    var listenerTool: ButtonListener? = null

    interface ButtonListener{
        fun previousListener(v: View)
        fun nextListener(v: View)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val v = inflater.inflate(R.layout.estatico_fragment, container,false)
        v.previous_button.setOnClickListener {
            listenerTool?.previousListener(it)
        }
        v.forward_button.setOnClickListener {
            listenerTool?.nextListener(it)
        }
        return v
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is ButtonListener) listenerTool = context
        else throw RuntimeException("Se necesita una implementación de  la interfaz")
    }

    override fun onDetach() {
        super.onDetach()
        listenerTool = null
    }
}
