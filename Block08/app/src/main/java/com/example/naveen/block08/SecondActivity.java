package com.example.naveen.block08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent caller = new Intent();
        Bundle extras = getIntent().getExtras();
        String stringName = extras.getString("Stringname");
        Float rating = Float.parseFloat(stringName);
        //float rating = caller.getFloatExtra("nbStars",0);
        TextView textview = (TextView) findViewById(R.id.textViewsecond);
        textview.setText("Welcome to Second Activity! Your rating is " + rating + " stars");
    }
}
