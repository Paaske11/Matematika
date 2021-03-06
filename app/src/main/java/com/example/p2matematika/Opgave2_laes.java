package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Opgave2_laes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opgave2_laes);

        hjemknap();
        menubtn();
        hjaelpknap();
        svarknap();
    }

    private void hjemknap(){
        ImageButton hjemknap = (ImageButton) findViewById(R.id.hjembtn);
        hjemknap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Opgave2_laes.this, BrugersideEfterTest.class));
            }
        });
    }
    private void menubtn() {
        ImageButton tilbage = (ImageButton) findViewById(R.id.menubtn);
        tilbage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Opgave2_laes.this, Plus_opgaver.class));
            }
        });
    }
    private void hjaelpknap() {
        ImageButton hjaelp = (ImageButton) findViewById(R.id.hjaelpbtn);
        hjaelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Opgave2_laes.this, Plushjaelplaesende.class));
            }
        });
    }

    private void svarknap (){
        ImageButton Svar_Knap = (ImageButton) findViewById(R.id.svarbtn);
        Svar_Knap.setOnClickListener(new View.OnClickListener() {
            EditText svartekst = (EditText) findViewById(R.id.svartekstlaesende2);
            //int svar = Integer.parseInt(svartekst.getText().toString());
            TextView forkert = (TextView) findViewById(R.id.forkertsvar);
            @Override
            public void onClick(View v) {
                if(Integer.valueOf(svartekst.getText().toString()) == 9) {
                    forkert.setTextColor(Color.rgb(0,128,0));
                    Plus_opgaver.opgaveDone = true;
                    forkert.setAlpha(1.00F);
                    forkert.setText("Rigtigt svar");
                    new CountDownTimer(1000, 1000) {
                        public void onFinish() {
                            startActivity(new Intent(Opgave2_laes.this, Plus_opgaver.class));
                        }

                        public void onTick(long millisUntilFinished) {
                            // millisUntilFinished    The amount of time until finished.
                        }
                    }.start();
                }
                else {

                    forkert.setAlpha(1.00F);
                }


            }
        });
    }
}
