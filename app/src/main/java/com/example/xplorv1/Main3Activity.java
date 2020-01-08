package com.example.xplorv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//add:
//how to play
//about
//contact us

//make roux studios show a web view of my web site


public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

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
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my link to my app package. (Insert android package here>>>>>>•<<<<<<)");
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, "A subject to arouse curiosity");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
