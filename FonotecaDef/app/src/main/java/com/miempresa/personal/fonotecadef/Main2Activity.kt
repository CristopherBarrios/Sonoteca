package com.miempresa.personal.fonotecadef

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun boton1(view: View) {
        val hola = Intent(this@Main2Activity, Main3Activity::class.java)
        startActivity(hola)
    }
    fun boton2(view: View) {
        val hola = Intent(this@Main2Activity, Main5Activity::class.java)
        startActivity(hola)
    }
}
