package com.example.naveen.block08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void enter(View v){
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        float rating = ratingBar.getRating();

       // Toast.makeText(getApplicationContext(),rating+ " stars",Toast.LENGTH_SHORT).show();
        Intent goToSecond = new Intent();
        Bundle extras = new Bundle();
        extras.putString("Stringname",rating + " ");
        goToSecond.setClass(this,SecondActivity.class);
        goToSecond.putExtras(extras);
        startActivity(goToSecond);
       finish();
    }
}
