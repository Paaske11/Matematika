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

public class Opgave1_laes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_opgave1_laes);
        hjemknap();
        tilbageknap();
        hjaelpknap();
        svarknap();
    }

        // Hjemknappen laves
    private void hjemknap(){
        ImageButton hjemknap = (ImageButton) findViewById(R.id.hjemknap_opg1);
        hjemknap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Opgave1_laes.this, BrugersideEfterTest.class));
            }
        });
    }

    //tilbageknappen
    private void tilbageknap() {
        ImageButton tilbage = (ImageButton) findViewById(R.id.tilbageknap);
        tilbage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Opgave1_laes.this, Plus_opgaver.class));
            }
        });
    }
    private void hjaelpknap() {
        ImageButton hjaelp = (ImageButton) findViewById(R.id.hjaelp_knap);
        hjaelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Opgave1_laes.this, Plushjaelplaesende.class));
            }
        });
    }
    private void svarknap (){
        ImageButton Svar_Knap = (ImageButton) findViewById(R.id.svar_knap);
        Svar_Knap.setOnClickListener(new View.OnClickListener() {
            EditText svartekst = (EditText) findViewById(R.id.svartekstlaesende);
            //int svar = Integer.parseInt(svartekst.getText().toString());
            TextView forkert = (TextView) findViewById(R.id.forkertsvar);
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                if(Integer.valueOf(svartekst.getText().toString()) == 8) {
                    forkert.setTextColor(Color.rgb(0,128,0));
                    forkert.setAlpha(100.00F);
                    forkert.setText("Rigtigt svar");
                    new CountDownTimer(1000, 1000) {
                        public void onFinish() {
                            startActivity(new Intent(Opgave1_laes.this, Plus_opgaver.class));
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
