package com.example.appactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Activity2 extends AppCompatActivity {

    private Button firstBtn;
    private Button secondBtn;
    private Button thirdBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);




        firstBtn = findViewById(R.id.first_button);
        firstBtn.setBackgroundColor(Color.argb(255, getRandomColor(), getRandomColor(), getRandomColor()));
        secondBtn = findViewById(R.id.second_button);
        secondBtn.setBackgroundColor(Color.argb(255, getRandomColor(), getRandomColor(), getRandomColor()));
        thirdBtn = findViewById(R.id.third_button);
        thirdBtn.setBackgroundColor(Color.argb(255, getRandomColor(), getRandomColor(), getRandomColor()));

        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable cd = (ColorDrawable) firstBtn.getBackground();
                int color  = cd.getColor();
                int red = Color.red(color);
                int green = Color.green(color);
                int blue  = Color.blue(color);
                Intent i = new Intent();
                i.putExtra("red", red);
                i.putExtra("green", green);
                i.putExtra("blue", blue);
                setResult(RESULT_OK, i);
                finish();

            }
        });

        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable cd = (ColorDrawable) secondBtn.getBackground();
                int color  = cd.getColor();
                int red = Color.red(color);
                int green = Color.green(color);
                int blue  = Color.blue(color);
                Intent i = new Intent();
                i.putExtra("red", red);
                i.putExtra("green", green);
                i.putExtra("blue", blue);
                setResult(RESULT_OK, i);
                finish();
            }
        });

        thirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable cd = (ColorDrawable) thirdBtn.getBackground();
                int color  = cd.getColor();
                int red = Color.red(color);
                int green = Color.green(color);
                int blue  = Color.blue(color);
                Intent i = new Intent();
                i.putExtra("red", red);
                i.putExtra("green", green);
                i.putExtra("blue", blue);
                setResult(RESULT_OK, i);
                finish();
            }
        });

    }

    public int getRandomColor(){
        Random rand = new Random();
        int c = 0;

            c=rand.nextInt(256);

        return c;
    }
}
