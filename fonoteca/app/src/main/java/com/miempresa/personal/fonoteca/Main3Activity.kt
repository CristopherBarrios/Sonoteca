package com.miempresa.personal.fonoteca

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        boton1.setOnClickListener {
            val intento1 = Intent(this, Main4Activity::class.java)
            startActivity(intento1)
        }
    }
}
