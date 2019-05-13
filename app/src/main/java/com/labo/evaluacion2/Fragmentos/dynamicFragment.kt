package com.labo.evaluacion2.Fragmentos

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.labo.evaluacion2.R
import kotlinx.android.synthetic.main.dinamico_fragment.view.*

class dynamicFragment: Fragment() {

    private var imageId: Int = 0

    companion object {
        fun newInstance(imageSet: Int):dynamicFragment{
            val newFragment = dynamicFragment()
            newFragment.imageId = imageSet
            return newFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val v = inflater.inflate(R.layout.dinamico_fragment, container, false)
        v.display_image.setImageResource(imageId)
        return v
    }

}