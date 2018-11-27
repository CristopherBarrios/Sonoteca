package com.miempresa.personal.fonotecadef

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun boton1(view: View) {
        val hola = Intent(this@MainActivity, Main2Activity::class.java)
        startActivity(hola)
    }
    fun boton2(view: View) {
        System.exit(0);
    }
    fun boton3(view: View) {
        val hola = Intent(this@MainActivity, Main6Activity::class.java)
        startActivity(hola)
    }
}
