package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    int c=0;
    int d=0;
    int a=0;
    int b=0;
    int x=0;
    int y=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addthree_teamA(View View)
    { scoreA=scoreA + 3;
        displayA(scoreA);}
    public void addtwo_teamA(View View)
    { scoreA=scoreA + 2;
        displayA(scoreA);}
    public void addone_teamA(View View)
    { scoreA=scoreA + 1;
        displayA(scoreA);}
    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_teamA);
        quantityTextView.setText("" + number);
    }
    public void addthree_teamB(View View)
    { scoreB=scoreB + 3;
        displayB(scoreB);}
    public void addtwo_teamB(View View)
    { scoreB=scoreB + 2;
        displayB(scoreB);}
    public void addone_teamB(View View)
    { scoreB=scoreB + 1;
        displayB(scoreB);}
    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_teamB);
        quantityTextView.setText("" + number);
    }
    public void addfoul_teamA(View View){
        c=c+1;
        displayFoulA(c);
    }
    private void displayFoulA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.foul_teamA);
        quantityTextView.setText("" + number);
    }
    public void addfoul_teamB(View View){
        d=d+1;
        displayFoulB(d);
    }
    private void displayFoulB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.foul_teamB);
        quantityTextView.setText("" + number);
    }
    public void resetboth(View View)
    { scoreA=0;
        scoreB=0;
        displayB(scoreB);
        displayA(scoreA);
        c=0;
        d=0;
        displayFoulA(c);
        displayFoulB(d);}
    public void quater(View View)
    {
        a=a+scoreA;
        b=b+scoreB;
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
        x=x+c;
        y=y+d;
        c=0;
        d=0;
        displayFoulA(c);
        displayFoulB(d);}
    public void total(View View) {
        if (a == 0) {
            displayA(scoreA);
            displayB(scoreB);
            scoreA=0;
            scoreB=0;
        } else {
            displayA(a);
            displayB(b);
            a=0;
            b=0;
        }
        displayFoulA(x);
        displayFoulB(y);
        x=0;
        y=0;
    }
}
