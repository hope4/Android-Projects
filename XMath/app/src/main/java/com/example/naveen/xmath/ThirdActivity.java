package com.example.naveen.xmath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.BatchUpdateException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

   private TextView textViewscore;
   private TextView textViewquestion;
   private EditText editText;

   private List<Question> questionList;

   int count = 0;
   private int score ;
   private int questioncounter=0;
   private int questioncounttotal;
   private Question currentquestion;
   private boolean answered;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third2);

        TextView textViewquestion = (TextView) findViewById(R.id.textviewquestion);
        editText = (EditText) findViewById(R.id.editTextanswer);
        textViewscore = (TextView) findViewById(R.id.textViewscore);
        Button buttonenter = (Button) findViewById(R.id.buttonenter);
        TextView textViewdisplaytimer = (TextView) findViewById(R.id.textViewtimerdisplay);

        XMathDbHelper xMathDbHelper = new XMathDbHelper(this);
        questionList = xMathDbHelper.getallquestions();
        questioncounter = questionList.size();
        Collections.shuffle(questionList);

        Button b1 = (Button) findViewById(R.id.n1);
        Button b2 = (Button) findViewById(R.id.n2);
        Button b3 = (Button) findViewById(R.id.n3);
        Button b4 = (Button) findViewById(R.id.n4);
        Button b5 = (Button) findViewById(R.id.n5);
        Button b6 = (Button) findViewById(R.id.n6);
        Button b7 = (Button) findViewById(R.id.n7);
        Button b8 = (Button) findViewById(R.id.n8);
        Button b9 = (Button) findViewById(R.id.n9);
        Button b0 = (Button) findViewById(R.id.n0);
        Button bdot = (Button) findViewById(R.id.ndot);
        Button bclr = (Button) findViewById(R.id.n1clr1);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(), "0"));
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(), "1"));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(), "2"));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(), "3"));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(), "4"));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(), "5"));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(), "6"));
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(), "7"));
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(), "8"));
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(), "9"));
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(), "."));
            }
        });
        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().delete(editText.getText().length() - 1, editText.getText().length()));
            }
        });

        // showNextQuestion();
        //    editText.setText("");

            textViewquestion.setText("Question : 1 \n 2 + 2 =");
            editText.setText("");
            buttonenter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String answer = editText.getText().toString();
                    int anservalue = Integer.parseInt(answer);
                    if (anservalue == 4) {
                        Toast.makeText(getApplicationContext(), "Correct , you earned 10 points", Toast.LENGTH_SHORT).show();
                        textViewscore.setText("Score : 10");
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                    }
                }
            });

    }

}