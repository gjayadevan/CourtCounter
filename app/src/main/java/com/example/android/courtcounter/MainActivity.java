package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * My first real app
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void threePointerA(View v){
        TextView tv = (TextView)findViewById(R.id.text_view_score_teamA);
        String st = (String)tv.getText();
        Integer i = new Integer(st);
        i = i+3;
        st = i.toString();
        tv.setText(st);
    }

    protected void twoPointerA(View v){
        TextView tv = (TextView)findViewById(R.id.text_view_score_teamA);
        String s = (String)tv.getText();
        Integer i = new Integer(s);
        i = i+2;
        s = i.toString();
        tv.setText(s);
    }
    protected void freeThrowA(View v){
        TextView tv = (TextView)findViewById(R.id.text_view_score_teamA);
        String s = (String)tv.getText();
        Integer i = new Integer(s);
        i = i+1;
        s = i.toString();
        tv.setText(s);
    }

    protected void threePointerB(View v){
        TextView tv = (TextView)findViewById(R.id.text_view_score_teamB);
        String s = (String)tv.getText();
        Integer i = new Integer(s);
        i = i+3;
        s = i.toString();
        tv.setText(s);
    }

    protected void twoPointerB(View v){
        TextView tv = (TextView)findViewById(R.id.text_view_score_teamB);
        String s = (String)tv.getText();
        Integer i = new Integer(s);
        i = i+2;
        s = i.toString();
        tv.setText(s);
    }
    protected void freeThrowB(View v){
        TextView tv = (TextView)findViewById(R.id.text_view_score_teamB);
        String s = (String)tv.getText();
        Integer i = new Integer(s);
        i = i+1;
        s = i.toString();
        tv.setText(s);
    }
    protected void reset(View v){
        TextView tv = (TextView)findViewById(R.id.text_view_score_teamA);
        tv.setText("0");
        tv = (TextView)findViewById(R.id.text_view_score_teamB);
        tv.setText("0");
    }
}
