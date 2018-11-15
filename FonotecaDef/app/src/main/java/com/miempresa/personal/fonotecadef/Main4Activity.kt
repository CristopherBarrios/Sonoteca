package com.miempresa.personal.fonotecadef

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat.getExtras
import android.util.Log

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //val song = getExtras("name")


        setContentView(R.layout.activity_main4)

        Log.d("NAME SONG", intent.getStringExtra("name").toString())
    }
}
