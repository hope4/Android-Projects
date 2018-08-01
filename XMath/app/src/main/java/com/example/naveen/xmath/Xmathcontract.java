package com.example.naveen.xmath;

import android.provider.BaseColumns;

public final class Xmathcontract {

    private Xmathcontract(){

    }
    public static class Questionstable implements BaseColumns{

        public static final String TABLE_NAME = "X_Math_questions";
        public static final String COLUMN_QUESITON = "question";
        public static final String ANSWER_NR ="answer_number";
     }
}
