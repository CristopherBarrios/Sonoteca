package com.miempresa.personal.youtuby

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Main2Activity : AppCompatActivity() {

    var YouTubePlayerView =

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val YouTubePlayerView: youTubePlayerView = (YouTubePlayerView) findViewById (R.id.youtube_view)
    }
}
