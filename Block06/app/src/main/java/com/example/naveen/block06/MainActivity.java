package com.example.naveen.block06;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView_small = (ImageView) findViewById(R.id.ImageViewSmall);
        imageView_small.setImageResource(R.drawable.drawing);
        final ImageView imageView_large = (ImageView) findViewById(R.id.ImageViewlarge);
        imageView_large.setImageResource(R.drawable.drawing);

        SeekBar tuner = (SeekBar) findViewById(R.id.seekbar_tuner);
        tuner.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int lastprogress;
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                lastprogress = i;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                imageView_large.setColorFilter(Color.argb(255,0,lastprogress,255-lastprogress));
            }
        });
    }
}
