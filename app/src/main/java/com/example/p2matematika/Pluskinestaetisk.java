package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Pluskinestaetisk extends AppCompatActivity {

boolean alpha1 = false;
boolean alpha2 = false;
boolean alpha3 = false;
boolean alpha4 = false;
private ImageView objectone;
private ImageView objecttwo;
private ImageView objectthree;
private ImageView objectfour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pluskinestaetisk);

        //gør søjle 1 "clickable" og sætter dens gennesigtighed
        objectone = (ImageView) findViewById(R.id.soojleet);
        objectone.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                if (alpha1 == false) {
                    objectone.setAlpha(60.00F);
                    alpha1 = true;
                } else {
                    objectone.setAlpha(100.00F);
                    alpha1 = false;
                }
            }
        });

        //gør søjle 2 "clickable" og sætter dens gennesigtighed
        objecttwo = (ImageView) findViewById(R.id.soojleto);
        objecttwo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                if (alpha2 == false) {
                    objecttwo.setAlpha(60.00F);
                    alpha2 = true;
                } else {
                    objecttwo.setAlpha(100.00F);
                    alpha2 = false;
                }
            }
        });

        //gør søjle 3 "clickable" og sætter dens gennesigtighed
        objectthree = (ImageView) findViewById(R.id.soojletre);
        objectthree.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                if (alpha3 == false) {
                    objectthree.setAlpha(60.00F);
                    alpha3 = true;
                } else {
                    objectthree.setAlpha(100.00F);
                    alpha3 = false;
                }
            }
        });

        //gør søjle 4 "clickable" og sætter dens gennesigtighed
        objectfour = (ImageView) findViewById(R.id.soojlefire);
        objectfour.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                if (alpha4 == false) {
                    objectfour.setAlpha(60.00F);
                    alpha4 = true;
                } else {
                    objectfour.setAlpha(100.00F);
                    alpha4 = false;
                }

            }
        });
    }
}






