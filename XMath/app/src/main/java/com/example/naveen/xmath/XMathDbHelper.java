package com.example.naveen.xmath;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.naveen.xmath.Xmathcontract.*;

import java.util.ArrayList;
import java.util.List;

public class XMathDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "MyXmath.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;


    public XMathDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                    Questionstable.TABLE_NAME + " ( " +
                    Questionstable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    Questionstable.COLUMN_QUESITON + " TEXT, " +
                    Questionstable.ANSWER_NR + " INTEGER" + ")";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionstable();
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + Questionstable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionstable(){
        Question q1 = new Question("2 + 2",4);
        addQuestion(q1);
        Question q2 = new Question("3 * 2",6);
        addQuestion(q2);
        Question q3 = new Question("12 ^ 2",144);
        addQuestion(q3);
        Question q4 = new Question("25 * 8",200);
        addQuestion(q4);
        Question q5 = new Question("2056 / 4",514);
        addQuestion(q5);
    }

    private void addQuestion(Question question){
        ContentValues cv = new ContentValues();
        cv.put(Questionstable.COLUMN_QUESITON,question.getQuesiton());
        cv.put(Questionstable.ANSWER_NR,question.getAnswerNr());
        db.insert(Questionstable.TABLE_NAME,null,cv);
    }

    public List<Question> getallquestions(){
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM "+ Questionstable.TABLE_NAME,null);
        if(c.moveToFirst()){
            do{
                Question question = new Question();
                question.setQuesiton(c.getString(c.getColumnIndex(Questionstable.COLUMN_QUESITON)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(Questionstable.ANSWER_NR)));
                questionList.add(question);
            }while (c.moveToNext());
        }
        c.close();
        return questionList;
    }
}
