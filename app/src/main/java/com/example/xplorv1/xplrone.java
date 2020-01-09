package com.example.xplorv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class xplrone extends AppCompatActivity {

    LinearLayout question, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xplrone);
        question = findViewById(R.id.doors);
        answer = findViewById(R.id.doorskeys);
        getSupportActionBar().hide();
    }


    public void keys(View view){
        question.setVisibility(View.INVISIBLE);
        answer.setVisibility(View.VISIBLE);

    }
}
