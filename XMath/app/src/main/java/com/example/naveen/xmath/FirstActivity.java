package com.example.naveen.xmath;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

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

    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }



}
