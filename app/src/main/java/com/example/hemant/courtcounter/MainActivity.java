package com.example.hemant.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static int scoreTeamA = 0;
    static int scoreTeamB = 0;

    private static final String TEAM_A_SCORE = "teamAscore";
    private static final String TEAM_B_SCORE = "teamBscore";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        if (savedInstanceState != null){
            if (savedInstanceState.containsKey(TEAM_A_SCORE) && savedInstanceState.containsKey(TEAM_B_SCORE)){
                int teamAscore = savedInstanceState.getInt(TEAM_A_SCORE);
                int teamBscore = savedInstanceState.getInt(TEAM_B_SCORE);
                displayForTeamA(teamAscore);
                displayForTeamB(teamBscore);
            }
        }
    }

    /**
     * Increase Team A score by 3
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Increase Team A score by 2
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Increase Team A score by 1
     */
    public void addOneForTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Display the score of Team A
     */
    public void displayForTeamA(int score) {
        // Update the score display in the textView in layout_main for team A
        TextView scoreViewNew = findViewById(R.id.team_a_score_main);
        scoreViewNew.setText(String.valueOf(score));
    }


    /**
     * Increase Team B score by 3
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Increase Team B score by 2
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Increase Team B score by 1
     */
    public void addOneForTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Display the score of Team B
     */
    public void displayForTeamB(int score) {
        // Update the score display in the textView in layout_main for team B
        TextView scoreViewNew = findViewById(R.id.team_b_score_main);
        scoreViewNew.setText(String.valueOf(score));
    }

    /*
    *  Reset the scores of Team A and Team B
    */

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(TEAM_A_SCORE,scoreTeamA);
        outState.putInt(TEAM_B_SCORE,scoreTeamB);
    }
}

