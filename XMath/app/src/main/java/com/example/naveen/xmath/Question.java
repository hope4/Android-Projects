package com.example.naveen.xmath;

public class Question {
    private String quesiton;
    private int answerNr;


    public Question(){

    }

    public Question(String quesiton, int answerNr) {
        this.quesiton = quesiton;
        this.answerNr = answerNr;
    }

    public String getQuesiton() {
        return quesiton;
    }

    public void setQuesiton(String quesiton) {
        this.quesiton = quesiton;
    }

    public int getAnswerNr() {
        return answerNr;
    }

    public void setAnswerNr(int answerNr) {
        this.answerNr = answerNr;
    }
}
