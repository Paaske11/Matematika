package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Pluskinestaetisk extends AppCompatActivity {

private ImageView objectone;
private ImageView objecttwo;
private ImageView objectthree;
private ImageView objectfour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pluskinestaetisk);

        objectone = (ImageView) findViewById(R.id.soojleet);
        objectone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        objecttwo = (ImageView) findViewById(R.id.soojleto);
        objecttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        objectthree = (ImageView) findViewById(R.id.soojletre);
        objectthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        objectfour = (ImageView) findViewById(R.id.soojlefire);
        objectfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    }



