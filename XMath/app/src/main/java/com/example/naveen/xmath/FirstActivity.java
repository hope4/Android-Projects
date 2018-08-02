package com.example.naveen.xmath;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    private TextView textViewhighscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        SharedPreferences preferences = getSharedPreferences("Highscore", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();


        Button buttoinstructions = (Button) findViewById(R.id.buttoninstructions);
        buttoinstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent gotoEasy = new Intent();
                    gotoEasy.setClass(FirstActivity.this, SecondActivity.class);
                    startActivity(gotoEasy);
                }
                catch (NullPointerException e){

                }
            }
        });
        Button buttoplay = (Button) findViewById(R.id.buttonplay);
        buttoplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(getApplicationContext(),ThirdActivity.class));
                }
                catch (NullPointerException e){

                }
            }
        });

    }


}
