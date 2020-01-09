package com.example.xplorv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class contactUs extends AppCompatActivity {
    EditText fname, subject, email, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        getSupportActionBar().hide();

        fname = findViewById(R.id.fname);
        subject = findViewById(R.id.subject);
        email = findViewById(R.id.email);
        message = findViewById(R.id.message);
    }




    public void submit(View v){
        String name = fname.getText().toString();
        String title = subject.getText().toString();
        String messages = message.getText().toString();

        Intent msg = new Intent(Intent.ACTION_SEND);
        msg.setType("message/rfc822");
        msg.putExtra(Intent.EXTRA_EMAIL , new String[]{"rous.epistola@triosstudent.com"});
        msg.putExtra(Intent.EXTRA_SUBJECT, "Email From: " + name + " Subject: " + title);
        msg.putExtra(Intent.EXTRA_TEXT, messages);

        try{
            startActivity(Intent.createChooser(msg, "Send mail..."));
        } catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(this, "No email client installed",Toast.LENGTH_LONG).show();
        }

    }



    public void call(View v){

        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:+16475273835"));//change the number
        startActivity(callIntent);

    }
}
