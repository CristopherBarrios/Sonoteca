package com.miempresa.personal.fonotecadef;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    Button play_pause, btn_repetir;
    MediaPlayer mp;
    int repetir = 2, posicion = 0;

    MediaPlayer vectormo[] = new MediaPlayer[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        play_pause = (Button)findViewById(R.id.btn_play);
        btn_repetir = (Button)findViewById(R.id.btn_repetir);

        vectormo[0] = MediaPlayer.create(this, R.raw.cancion);
        vectormo[1] = MediaPlayer.create(this, R.raw.cancion2);
        vectormo[2] = MediaPlayer.create(this, R.raw.cancion3);

    }
    public void PlayPause(View view){
        if (vectormo[posicion].isPlaying()) {
            vectormo[posicion].pause();
            //play_pause.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
        }else{
            vectormo[posicion].start();
            //play_pause.setBackgroundResource(R.drawable.pausa);
            Toast.makeText(this, "play", Toast.LENGTH_SHORT).show();
        }
    }

    //Stop
    public void Stop(View view){
        if(vectormo[posicion] !=null){
            vectormo[posicion].stop();

            vectormo[0] = MediaPlayer.create(this, R.raw.cancion);
            vectormo[1] = MediaPlayer.create(this, R.raw.cancion2);
            vectormo[2] = MediaPlayer.create(this, R.raw.cancion3);
            posicion = 0;
            //play_pause.setBackgroundResource(R.drawable.reproducir);
            //iv.setImageResource(R.drawable.portada1);
            Toast.makeText(this, "Stop",Toast.LENGTH_SHORT).show();
        }
    }
    //repetir
    public void Repetir(View view){
        if(repetir == 1){
            //btn_repetir.setBackgroundResource(R.drawable.no_repetir);
            Toast.makeText(this, "No repetir",)
        }
    }

}
