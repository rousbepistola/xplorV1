package com.example.xplorv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class howtoplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howtoplay);
    }


    public void rate(View v){
       Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.sbm.bc.smartbooksmobile"));
        startActivity(intent);
    }
}
