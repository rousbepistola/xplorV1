package com.example.xplorv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

//add:
//how to play
//about
//contact us

//make roux studios show a web view of my web site




//features included in the app
//•landscape version
//•splash screen
//•if statements
//•case statement
//•scrollview
//•imageview
//•button
//•imageButton
//•call
//other layout, linear layout
//•email
//•videoview
//•radiobutton
//•hiding and showing elements
//•webview
//•textview
//•editText
//•new page intent
//•on click to go to app store
//•rating bar
//•redirecting to app store
//•font color?
//icon logo



public class Main3Activity extends AppCompatActivity {
    ProgressBar progressBar;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        progressBar = findViewById(R.id.progressBar3);
        button = findViewById(R.id.download);

        getSupportActionBar().hide();
    }


                         //DASHBOARD AREA
    public void howtoplay(View view){
        Intent ni = new Intent(this, howtoplay.class);
        startActivity(ni);
    }

    public void aboutUs(View view){
        Intent ni = new Intent(this, aboutUs.class);
        startActivity(ni);
    }

    public void contactUs(View view){
        Intent ni = new Intent(this, contactUs.class);
        startActivity(ni);
    }



                            //XPLOR AREA
    public void xplrone(View view){
        Intent ni = new Intent(this, xplrone.class);
        startActivity(ni);
    }

    public void xplrtwo(View view){
        Intent ni = new Intent(this, xplrtwo.class);
        startActivity(ni);
    }

    public void xplrthree(View view){
        Intent ni = new Intent(this, xplrthree.class);
        startActivity(ni);
    }

    public void xplrfour(View view){
        Intent ni = new Intent(this, xplrfour.class);
        startActivity(ni);
    }

    public void xplrfive(View view){
        Intent ni = new Intent(this, xplrfive.class);
        startActivity(ni);
    }

    public void xplrsix(View view){
        Intent ni = new Intent(this, xplrsix.class);
        startActivity(ni);
    }

    public void roux(View view){
        Intent ni = new Intent(this, roux.class);
        startActivity(ni);
    }


    //share buttons

    public void shareone(View view){
        progressBar.setProgress(progressBar.getProgress() + 1);

        if(progressBar.getProgress() == 6){
            progressBar.setVisibility(View.INVISIBLE);
            button.setVisibility(View.VISIBLE);
        }

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my link to my app package. (Insert android package here>>>>>>•<<<<<<)");
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, "A subject to arouse curiosity");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
