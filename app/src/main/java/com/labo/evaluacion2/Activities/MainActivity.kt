package com.labo.evaluacion2.Activities
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.labo.evaluacion2.R


class MainActivity : AppCompatActivity(), View.OnClickListener {

    internal var piedra1: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       piedra1 = findViewById(R.id.piedra1)

        piedra1.setOnClickListener(this)

    }


    override fun onClick(v: View) {

        val ArrayImagenes = intArrayOf(
            R.drawable.piedra,
            R.drawable.piedra2
        )

        val viewId = v.getId()


        when (viewId) {

            R.id.piedra1 -> {

                piedra1.setImageResource(ArrayImagenes[Math.floor(Math.random() * 2).toInt()])

            }
 //para fragmento 2
            R.id.piedra2 -> {

                piedra2.setImageResource(ArrayImagenes[Math.floor(Math.random() * 2).toInt()])

            }



    }
    }
}
