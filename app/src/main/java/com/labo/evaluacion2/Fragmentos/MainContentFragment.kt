package com.labo.evaluacion2.Fragmentos


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide


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
        view.movie_title_main_content_fragment.text = movie.Title
        Glide.with(view).load(movie.Poster)
            .placeholder(R.drawable.ic_launcher_background)
            .into(view.image_main_content_fragment)
    }

}