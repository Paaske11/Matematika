package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


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
        hjaelpbtn();
        hjembtn();
        menubtn();
        svarbtn();

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

    //Dette laver hjælp knappen så man kan få hjælp hvis man har svært ved spørgsmålet
    private void hjaelpbtn() {
        ImageButton hjaelpbtn = (ImageButton) findViewById(R.id.hjaelpbtn);
        hjaelpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pluskinestaetisk.this, Plushjaelpkinestaetisk.class));
            }
        });
    }

    private void hjembtn() {
        ImageButton hjembtn = (ImageButton) findViewById(R.id.hjembtn);
        hjembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pluskinestaetisk.this, BrugersideEfterTest.class));
            }
        });
    }

    private void menubtn() {
        ImageButton menubtn = (ImageButton) findViewById(R.id.menubtn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pluskinestaetisk.this, Plus_opgaver.class));
            }
        });
    }

    private void svarbtn() {
        ImageButton svarbtn = (ImageButton) findViewById(R.id.svarbtn);
        final TextView wronganswer = (TextView) findViewById(R.id.wronganswer);
        svarbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                if (alpha1 == false && alpha2 == false && alpha3 == true && alpha4 == true) {
                    wronganswer.setTextColor(Color.rgb(0, 128, 0));
                    wronganswer.setAlpha(100.00F);
                    wronganswer.setText("Rigtigt svar");
                    new CountDownTimer(1000, 1000) {
                        public void onFinish() {
                            startActivity(new Intent(Pluskinestaetisk.this, Plus_opgaver.class));
                        }

                        public void onTick(long millisUntilFinished) {
                            // millisUntilFinished    The amount of time until finished.
                        }
                    }.start();
                }
                else {

                    wronganswer.setAlpha(100.00F);
                }
                }
            });
        }
    }







