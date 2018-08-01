package com.example.naveen.xmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button buttoinstructions = (Button) findViewById(R.id.buttoninstructions);
        buttoinstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = "Easy";
                try {
                    Intent gotoEasy = new Intent();
                    gotoEasy.setClass(FirstActivity.this, SecondActivity.class);
                    gotoEasy.putExtra("stringname", name);
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
                    Intent gotoplay = new Intent();
                    gotoplay.setClass(FirstActivity.this, ThirdActivity.class);
                   // gotoEasy.putExtra("stringname", name);
                    startActivity(gotoplay);
                }
                catch (NullPointerException e){

                }
            }
        });
    }


}
