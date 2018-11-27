package com.miempresa.personal.fonotecadef;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    Button play_pause, btn_repetir;
    MediaPlayer mp;
    ImageView iv;
    int repetir = 2, posicion = 0;

    MediaPlayer vectormo[] = new MediaPlayer[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        play_pause = (Button)findViewById(R.id.btn_play);
        btn_repetir = (Button)findViewById(R.id.btn_repetir);

        vectormo[0] = MediaPlayer.create(this, R.raw.cancion1);
        vectormo[1] = MediaPlayer.create(this, R.raw.cancion2);
        vectormo[2] = MediaPlayer.create(this, R.raw.cancion3);
        vectormo[3] = MediaPlayer.create(this, R.raw.cancion4);
        vectormo[4] = MediaPlayer.create(this, R.raw.cancion5);

    }
    public void PlayPause(View view){
        if (vectormo[posicion].isPlaying()) {
            vectormo[posicion].pause();
            play_pause.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
        }else{
            vectormo[posicion].start();
            play_pause.setBackgroundResource(R.drawable.pausa);
            Toast.makeText(this, "play", Toast.LENGTH_SHORT).show();
        }
    }

    //Stop
    public void Stop(View view){
        if(vectormo[posicion] !=null){
            vectormo[posicion].stop();

            vectormo[0] = MediaPlayer.create(this, R.raw.cancion1);
            vectormo[1] = MediaPlayer.create(this, R.raw.cancion2);
            vectormo[2] = MediaPlayer.create(this, R.raw.cancion3);
            vectormo[3] = MediaPlayer.create(this, R.raw.cancion4);
            vectormo[4] = MediaPlayer.create(this, R.raw.cancion5);
            posicion = 0;
            play_pause.setBackgroundResource(R.drawable.reproducir);
            //iv.setImageResource(R.drawable.portada1);
            Toast.makeText(this, "Stop",Toast.LENGTH_SHORT).show();
        }
    }
    //repetir
    public void Repetir(View view){
        if(repetir == 1){
            btn_repetir.setBackgroundResource(R.drawable.no_repetir);
            Toast.makeText(this, "No repetir", Toast.LENGTH_SHORT).show();
            vectormo[posicion].setLooping(false);
            repetir = 2;
        }else{
            btn_repetir.setBackgroundResource(R.drawable.repetir);
            Toast.makeText(this, "Repetir", Toast.LENGTH_SHORT).show();
            vectormo[posicion].setLooping(true);
            repetir = 1;
        }
    }

    //siguiente
    public void Siguiente(View view){
        if(posicion < vectormo.length -1){

            if(vectormo[posicion].isPlaying()){
                vectormo[posicion].stop();
                posicion++;
                vectormo[posicion].start();

                if(posicion == 0){
                    //iv.setImageResource(R.drawable.portada1);
                }else if (posicion == 1){
                    //iv.setImageResource(R.drawable.portada2);
                } else if (posicion == 2){
                    //iv.setImageResource(R.drawable.portada3);
                }else if (posicion == 3){
                   // iv.setImageResource(R.drawable.portada4);
                }else if (posicion == 4){
                    //iv.setImageResource(R.drawable.portada5);
                }
            }else{
                posicion++;
                if(posicion == 0){
                    //iv.setImageResource(R.drawable.portada1);
                }else if (posicion == 1){
                   // iv.setImageResource(R.drawable.portada2);
                } else if (posicion == 2){
                   // iv.setImageResource(R.drawable.portada3);
                }else if (posicion == 3){
                   // iv.setImageResource(R.drawable.portada4);
                }else if (posicion == 4){
                    //iv.setImageResource(R.drawable.portada5);
                }

            }
        }else{
            Toast.makeText(this, "No hay mas canciones", Toast.LENGTH_SHORT).show();
        }
    }
    public void Anterior(View view){
        if(posicion >= 1){

            if(vectormo[posicion].isPlaying()){
                vectormo[posicion].stop();
                vectormo[0] = MediaPlayer.create(this, R.raw.cancion1);
                vectormo[1] = MediaPlayer.create(this, R.raw.cancion2);
                vectormo[2] = MediaPlayer.create(this, R.raw.cancion3);
                vectormo[3] = MediaPlayer.create(this, R.raw.cancion4);
                vectormo[4] = MediaPlayer.create(this, R.raw.cancion5);
                posicion--;

                if(posicion == 0){
                    //iv.setImageResource(R.drawable.portada1);
                }else if (posicion == 1){
                   // iv.setImageResource(R.drawable.portada2);
                } else if (posicion == 2){
                   // iv.setImageResource(R.drawable.portada3);
                }else if (posicion == 3){
                   // iv.setImageResource(R.drawable.portada4);
                }else if (posicion == 4){
                   // iv.setImageResource(R.drawable.portada5);
                }
                vectormo[posicion].start();
            }else{
                posicion--;
                if(posicion == 0){
                   // iv.setImageResource(R.drawable.portada1);
                }else if (posicion == 1){
                    //iv.setImageResource(R.drawable.portada2);
                } else if (posicion == 2){
                   // iv.setImageResource(R.drawable.portada3);
                }else if (posicion == 3){
                   // iv.setImageResource(R.drawable.portada4);
                }else if (posicion == 4){
                    //iv.setImageResource(R.drawable.portada5);
                }

            }
        }else{
            Toast.makeText(this, "No hay mas canciones", Toast.LENGTH_SHORT).show();
        }
    }

}
