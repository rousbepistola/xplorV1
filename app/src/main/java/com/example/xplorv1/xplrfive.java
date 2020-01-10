package com.example.xplorv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class xplrfive extends AppCompatActivity {
    TextView one, two, three, four, five, six, seven, eight;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xplrfive);

        getSupportActionBar().hide();

        one = findViewById(R.id.text1);
        two = findViewById(R.id.text2);
        three = findViewById(R.id.text3);
        four = findViewById(R.id.text4);
        five = findViewById(R.id.text5);
        six = findViewById(R.id.text6);
        seven = findViewById(R.id.text7);
        eight = findViewById(R.id.text8);

        button = findViewById(R.id.button2);
    }

    int count = 0;

    public void next(View view) {
        count++;

        switch (count) {
            case 1: {
                one.setVisibility(View.GONE);
                two.setVisibility(View.VISIBLE);
                three.setVisibility(View.GONE);
                four.setVisibility(View.GONE);
                five.setVisibility(View.GONE);
                six.setVisibility(View.GONE);
                seven.setVisibility(View.GONE);
                eight.setVisibility(View.GONE);
                break;
            }

            case 2: {
                one.setVisibility(View.GONE);
                two.setVisibility(View.GONE);
                three.setVisibility(View.VISIBLE);
                four.setVisibility(View.GONE);
                five.setVisibility(View.GONE);
                six.setVisibility(View.GONE);
                seven.setVisibility(View.GONE);
                eight.setVisibility(View.GONE);
                break;
            }

            case 3: {
                one.setVisibility(View.GONE);
                two.setVisibility(View.GONE);
                three.setVisibility(View.GONE);
                four.setVisibility(View.VISIBLE);
                five.setVisibility(View.GONE);
                six.setVisibility(View.GONE);
                seven.setVisibility(View.GONE);
                eight.setVisibility(View.GONE);
                break;
            }

            case 4: {
                one.setVisibility(View.GONE);
                two.setVisibility(View.GONE);
                three.setVisibility(View.GONE);
                four.setVisibility(View.GONE);
                five.setVisibility(View.VISIBLE);
                six.setVisibility(View.GONE);
                seven.setVisibility(View.GONE);
                eight.setVisibility(View.GONE);
                break;
            }

            case 5: {
                one.setVisibility(View.GONE);
                two.setVisibility(View.GONE);
                three.setVisibility(View.GONE);
                four.setVisibility(View.GONE);
                five.setVisibility(View.GONE);
                six.setVisibility(View.VISIBLE);
                seven.setVisibility(View.GONE);
                eight.setVisibility(View.GONE);
                break;
            }

            case 6: {
                one.setVisibility(View.GONE);
                two.setVisibility(View.GONE);
                three.setVisibility(View.GONE);
                four.setVisibility(View.GONE);
                five.setVisibility(View.GONE);
                six.setVisibility(View.GONE);
                seven.setVisibility(View.VISIBLE);
                eight.setVisibility(View.GONE);
                break;
            }

            case 7: {
                one.setVisibility(View.GONE);
                two.setVisibility(View.GONE);
                three.setVisibility(View.GONE);
                four.setVisibility(View.GONE);
                five.setVisibility(View.GONE);
                six.setVisibility(View.GONE);
                seven.setVisibility(View.GONE);
                eight.setVisibility(View.VISIBLE);

                button.setText("Finish");
                break;
            }

            case 8: {
                Intent ni = new Intent(this, Main3Activity.class);
                startActivity(ni);
            }
        }
    }
}