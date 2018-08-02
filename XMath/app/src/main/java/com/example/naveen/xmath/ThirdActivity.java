package com.example.naveen.xmath;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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


   private  QuestionLibrary mQuestionLibrary = new QuestionLibrary();
   private TextView textViewscore;
   private TextView textViewquestion;
   private EditText editText;
   private Button buttonenter;
   private Button Buttonend;
   private TextView textViewdisplaytimer;
   private Button b1;
   private Button b2;
   private Button b3;
   private Button b4;
   private Button b5;
   private Button b6;
   private Button b7;
   private Button b8;
   private Button b9;
   private Button b0;
   private Button bdot;
   private Button bclr;


   private String answer;
   private int score = 0;
   private int questionnumber =0;


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third2);

        textViewquestion = (TextView) findViewById(R.id.textviewquestion);
        editText = (EditText) findViewById(R.id.editTextanswer);
        textViewscore = (TextView) findViewById(R.id.textViewscore);
        buttonenter = (Button) findViewById(R.id.buttonenter);
        textViewdisplaytimer = (TextView) findViewById(R.id.textViewtimerdisplay);
        Buttonend = (Button) findViewById(R.id.buttonend);

        b1 = (Button) findViewById(R.id.n1);
        b2 = (Button) findViewById(R.id.n2);
        b3 = (Button) findViewById(R.id.n3);
        b4 = (Button) findViewById(R.id.n4);
        b5 = (Button) findViewById(R.id.n5);
        b6 = (Button) findViewById(R.id.n6);
        b7 = (Button) findViewById(R.id.n7);
        b8 = (Button) findViewById(R.id.n8);
        b9 = (Button) findViewById(R.id.n9);
        b0 = (Button) findViewById(R.id.n0);
        bdot = (Button) findViewById(R.id.ndot);
        bclr = (Button) findViewById(R.id.n1clr1);

        editText.setText("");
        updatequestion();

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
                if(editText.getText().toString().matches("")){
                    Toast.makeText(getApplicationContext(),"Nothing to clear",Toast.LENGTH_SHORT).show();
                }
                else {
                    editText.setText(editText.getText().delete(editText.getText().length() - 1, editText.getText().length()));

                }
            }
        });

        // showNextQuestion();
        //    editText.setText("");

        buttonenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getApplicationContext(),answer,Toast.LENGTH_SHORT).show();
               // Toast.makeText(getApplicationContext(),editText.getText(),Toast.LENGTH_SHORT).show();
                int n = mQuestionLibrary.getQuestioncount();
              //  String m = String.valueOf(questionnumber);
               // Toast.makeText(getApplicationContext(),m,Toast.LENGTH_SHORT).show();
                if(questionnumber < n) {
                    if (editText.getText().toString().equals(answer)) {
                        score = score + 10;
                        updateScore(score);
                        editText.setText("");
                        updatequestion();

                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();

                    } else if(editText.getText().toString().matches("")){
                        Toast.makeText(getApplicationContext(), "Enter answer first", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        editText.setText("");
                        updatequestion();
                    }
                }
                else{
                   // Intent gotoFirst = new Intent(ThirdActivity.this,FirstActivity.class);
                   // startActivity(gotoFirst);
                    if (editText.getText().toString().equals(answer)) {
                        score = score + 10;
                        updateScore(score);
                        editText.setText("");
                        textViewquestion.setText("");

                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();

                    } else if(editText.getText().toString().matches("")){
                        Toast.makeText(getApplicationContext(), "Enter answer first", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        editText.setText("");
                        textViewquestion.setText("");
                    }
                    Toast.makeText(getApplicationContext(),"End of questions",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Buttonend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"U have ended the game\nYour score is:"+score,Toast.LENGTH_SHORT).show();
                Intent gotoFirst = new Intent(ThirdActivity.this,FirstActivity.class);
                startActivity(gotoFirst);
            }
        });


    }

    public void updatequestion(){
        int questionnum = questionnumber + 1;
        textViewquestion.setText("Question : "+ questionnum + "\n\n" + mQuestionLibrary.getQuestion(questionnumber));
        answer = mQuestionLibrary.getCorrectAnswer(questionnumber);
        questionnumber++;
    }

    public void updateScore(int point){
       textViewscore.setText("Score :"+ point);
    }

}