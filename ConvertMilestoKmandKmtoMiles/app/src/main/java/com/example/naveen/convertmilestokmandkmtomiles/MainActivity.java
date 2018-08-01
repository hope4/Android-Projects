package com.example.naveen.convertmilestokmandkmtomiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

import static java.lang.Double.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesToKm = (Button) findViewById(R.id.buttonConvMilesToKm);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                try {
                   double vMiles = Double.valueOf(textBoxMiles.getText().toString());
                   double vKm = vMiles / 0.62137;
                    DecimalFormat formalVal = new DecimalFormat("##.##");
                    textBoxKm.setText(formalVal.format(vKm));
                }
                catch(NumberFormatException e){

                }
            }
        });

        Button buttonConvKmToMiles = (Button) findViewById(R.id.buttonConvKmToMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);

                try {
                    double vKm = Double.valueOf(textBoxKm.getText().toString());
                    double vMiles = vKm * 0.62137;
                    DecimalFormat formalVal = new DecimalFormat("##.##");
                    textBoxMiles.setText(formalVal.format(vMiles));
                }
                catch (NumberFormatException e){
                }
            }
        });
    }
}
