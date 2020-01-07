package com.example.xplorv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

//things to do:
//1. design
//2. must click radio button to submit
//3. click submit goes to the main page of the app


public class Main2Activity extends AppCompatActivity {
    RadioButton radioButton;
    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        radioButton = findViewById(R.id.radioButton);
        imageButton = findViewById(R.id.imageButton);

    }


    public void submit(View view){
        if(radioButton.isChecked()){
            Intent il = new Intent(this, Main3Activity.class);
            startActivity(il);
        }else{
            Toast.makeText(this, "Agree to privacy policy to proceed",Toast.LENGTH_LONG).show();
        }
    }

}
