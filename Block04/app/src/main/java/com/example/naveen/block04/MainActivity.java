package com.example.naveen.block04;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer pianoMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pianoMusic = MediaPlayer.create(this, R.raw.piano);
        Switch looping = (Switch) findViewById(R.id.switchlooping);
        looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                pianoMusic.setLooping(b);
            }
        });
    }
    public void playMusic(View v){
      pianoMusic.start();
    }

    public void pauseMusic(View v){
        if(pianoMusic.isPlaying()){
            pianoMusic.pause();
        }
    }
}
