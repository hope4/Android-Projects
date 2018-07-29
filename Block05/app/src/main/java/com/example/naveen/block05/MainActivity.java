package com.example.naveen.block05;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getSharedPreferences("COLOR_PREF", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = preferences.edit();

        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);

        if (preferences.contains("colorid"))
           layout.setBackgroundColor(preferences.getInt("colorid",0));


        RadioGroup radioGroupcolors = (RadioGroup) findViewById(R.id.radioGroupColors);
        radioGroupcolors.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int colorcode = 0;
                switch (i) {
                    case R.id.radioButtonblue:
                        colorcode= Color.BLUE;
                        break;
                    case R.id.radioButtonMagenta:
                        colorcode= Color.MAGENTA;
                        break;
                    case R.id.radioButtonYellow:
                        colorcode = Color.YELLOW;
                        break;
                }
                layout.setBackgroundColor(colorcode);
                editor.putInt("colorid",colorcode);
                editor.commit();
            }
        });
    }
}
