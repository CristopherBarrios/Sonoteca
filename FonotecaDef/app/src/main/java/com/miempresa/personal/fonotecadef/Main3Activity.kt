package com.miempresa.personal.fonotecadef

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        setContentView(R.layout.activity_main3)
    }

    fun boton1(view: View) {
        val hola = Intent(this@Main3Activity, Main4Activity::class.java)
        hola.putExtra("name", editTextSong.text)
        startActivity(hola)
    }
}
