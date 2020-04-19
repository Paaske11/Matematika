package com.example.p2matematika;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class opgave1_visuel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opgave1_visuel);
        hjemknap();
        tilbage();
        hjaelpknap();
        svarknap();



    }

    private void hjemknap(){
        ImageButton hjemknap = (ImageButton) findViewById(R.id.visuelhjemknap);
        hjemknap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(opgave1_visuel.this, BrugersideEfterTest.class));
            }
        });
    }
    private void tilbage() {
        ImageButton tilbage = (ImageButton) findViewById(R.id.visueltilbageknap);
        tilbage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(opgave1_visuel.this, Plus_opgaver.class));
            }
        });
    }
    private void hjaelpknap() {
        ImageButton hjaelp = (ImageButton) findViewById(R.id.hjaelp_knapvisuel);
        hjaelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(opgave1_visuel.this, Plushjaelpvisuel.class));
            }
        });
    }


    private void svarknap (){
        ImageButton Svar_Knap = (ImageButton) findViewById(R.id.svar_knap2);
        Svar_Knap.setOnClickListener(new View.OnClickListener() {
            EditText svartekst = (EditText) findViewById(R.id.svartekstvisuel2);
            //int svar = Integer.parseInt(svartekst.getText().toString());
            TextView forkert = (TextView) findViewById(R.id.forkertsvar2);
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                if(Integer.valueOf(svartekst.getText().toString()) == 4) {
                    Plus_opgaver.opgaveDone = true;
                    forkert.setTextColor(Color.rgb(0,128,0));
                    forkert.setAlpha(100.00F);
                    forkert.setText("Rigtigt svar");
                    new CountDownTimer(1000, 1000) {
                        public void onFinish() {
                            startActivity(new Intent(opgave1_visuel.this, Plus_opgaver.class));
                        }

                        public void onTick(long millisUntilFinished) {
                            // millisUntilFinished    The amount of time until finished.
                        }
                    }.start();
                }
                else {

                    forkert.setAlpha(100.00F);
                }


            }
        });
    }
}

