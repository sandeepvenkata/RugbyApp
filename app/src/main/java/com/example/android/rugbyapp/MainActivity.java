package com.example.android.rugbyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int BULLS = 0 ;
    int EAGLES = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForBulls(0);
        displayForEagles(0);
    }
    public void addFourPointsToBulls(View view){
        BULLS=BULLS+4;
        displayForBulls(BULLS);
    }
    public void addOnePointToBulls(View view){
        BULLS=BULLS+1;
        displayForBulls(BULLS);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForBulls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_bulls);
        scoreView.setText(String.valueOf(score));
    }
    public void addFourPointsToEagles(View view){
        EAGLES=EAGLES+4;
        displayForEagles(EAGLES);
    }
    public void addOnePointToEagles(View view){
        EAGLES=EAGLES+1;
        displayForEagles(EAGLES);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForEagles(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_Eagle);
        scoreView.setText(String.valueOf(score));
    }
    public void SetToZero(View view){
        BULLS=0;
        EAGLES=0;
        displayForBulls(0);
        displayForEagles(0);
    }

}
