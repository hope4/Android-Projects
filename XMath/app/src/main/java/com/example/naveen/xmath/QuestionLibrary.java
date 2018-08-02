package com.example.naveen.xmath;

public class QuestionLibrary {
    private String mQuestions [] = {
            "2*2 =",
            "3*3 =",
            "4*4 =",
            "5*5 ="

    };

    private String mCorrectAnsweres[] = {"4","9","16","25"};

    public int getQuestioncount(){
    return mQuestions.length;
    }

    public String getQuestion(int a){
    String question = mQuestions[a];
    return question;
    }
    public  String getCorrectAnswer(int a){
        String answer = mCorrectAnsweres[a];
        return answer;
    }
}
