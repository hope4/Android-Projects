package com.example.naveen.block01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonblue, buttonPink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonblue  = (Button) findViewById(R.id.buttonblueInvisible);
        buttonblue.setOnClickListener(this);
        buttonPink = (Button) findViewById(R.id.buttonpinkPanther);
        buttonPink.setOnClickListener(this);
    }
    public void toDo(View v){
        if(v.equals(buttonblue)){
            //invisibility
            v.setVisibility(View.INVISIBLE);
        }
        if(v.equals(buttonPink)){
            Toast.makeText(getApplicationContext(),"to do to do to do ...",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        toDo(v);
    }
}
