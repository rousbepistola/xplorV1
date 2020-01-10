package com.example.xplorv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class xplrone extends AppCompatActivity {

    LinearLayout question, answer, answer1, choices;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xplrone);
        question = findViewById(R.id.doors);
        answer = findViewById(R.id.doorskeys);
        answer1 = findViewById(R.id.answer1);
        choices = findViewById(R.id.choice);
        button = findViewById(R.id.button);
        getSupportActionBar().hide();
    }

    int click = 0;
    public void keys(View view){
        click++;

        if(click == 0){
            question.setVisibility(View.VISIBLE);
            answer.setVisibility(View.GONE);
            answer1.setVisibility(View.GONE);
        }

        if(click == 1){
        question.setVisibility(View.GONE);
        answer.setVisibility(View.VISIBLE);
        answer1.setVisibility(View.GONE);
        choices.setVisibility(View.GONE);
        }

        if(click == 2){
            question.setVisibility(View.GONE);
            answer.setVisibility(View.GONE);
            answer1.setVisibility(View.VISIBLE);
            choices.setVisibility(View.GONE);
            button.setText("Finish");
        }

        if(click >= 3){
            Intent ni = new Intent(this, Main3Activity.class);
            startActivity(ni);
        }

    }



}
