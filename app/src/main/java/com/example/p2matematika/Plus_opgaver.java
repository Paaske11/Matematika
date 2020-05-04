package com.example.p2matematika;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Plus_opgaver extends AppCompatActivity {
    public static boolean opgaveDone = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus_opgaver);
        prepareOpg2();



        hjembtn();

        //Læsende opgaver
        if (Brugertest.laesendePoints>Brugertest.KinaetetiskPoint
                && Brugertest.laesendePoints>Brugertest.VisualPoints) {
            opgave1_laes_knap();
            if(opgaveDone==true) {
                opgave2_laeseknap();
            }

        }
        //Visuale opgaver
        if (Brugertest.VisualPoints>Brugertest.KinaetetiskPoint
                && Brugertest.VisualPoints>Brugertest.laesendePoints) {
            opgave1_visuel_knap();
            if(opgaveDone == true) {
                opgave2_visuelknap();
            }

        }
        //Kinaetetiske opgaver
        if (Brugertest.KinaetetiskPoint>Brugertest.laesendePoints
                && Brugertest.KinaetetiskPoint>Brugertest.VisualPoints) {
            opgave1_kinesaetisk_knap();

                opgave2_kinestaetiskknap();


        }
    }

    private void hjembtn() {
        final ImageButton hjemtbtn = (ImageButton) findViewById(R.id.hjembtn2);
        hjemtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plus_opgaver.this, BrugersideEfterTest.class));
            }
        });
    }

    private void opgave1_laes_knap() {
        final ImageButton opgave1laes = (ImageButton) findViewById(R.id.Opgave1_knap);
        opgave1laes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plus_opgaver.this, Opgave1_laes.class));
            }
        });
    }
    private void opgave1_visuel_knap() {
        final ImageButton opgave1visuel = (ImageButton) findViewById(R.id.Opgave1_knap);
        opgave1visuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plus_opgaver.this, opgave1_visuel.class));
            }
        });
    }
    private void opgave1_kinesaetisk_knap(){
        final ImageButton opgave1kinestaetisk = (ImageButton) findViewById(R.id.Opgave1_knap);
        opgave1kinestaetisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plus_opgaver.this, Pluskinestaetisk.class));
            }
        });
    }

    private void opgave2_laeseknap(){
        final ImageButton opg2knap = (ImageButton) findViewById(R.id.opgave2_knap);
        opg2knap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plus_opgaver.this, Opgave2_laes.class));
            }
        });
    }

    private void opgave2_visuelknap(){
        final ImageButton opg2knap = (ImageButton) findViewById(R.id.opgave2_knap);
        opg2knap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plus_opgaver.this, Opgave2_visuel.class));
            }
        });
    }
    private void opgave2_kinestaetiskknap(){
        final ImageButton opg2knap = (ImageButton) findViewById(R.id.opgave2_knap);
        opg2knap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plus_opgaver.this, Opgave2_kinestaetisk.class));
            }
        });
    }
    @SuppressLint("Range")
    private void prepareOpg2() {
        ImageButton opg2knap = (ImageButton) findViewById(R.id.opgave2_knap);
        if (opgaveDone == false) {
            opg2knap.setAlpha(0.68F);
        } else {
            opg2knap.setAlpha(1F);
        }

    }
}
