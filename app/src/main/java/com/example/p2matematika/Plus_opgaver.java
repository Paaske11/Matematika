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



        hjembtn();

        //Læsende opgaver
        if (Brugertest.laesendePoints>Brugertest.KinaetetiskPoint
                && Brugertest.laesendePoints>Brugertest.VisualPoints) {
            opgave1_laes_knap();

        }
        //Visuale opgaver
        if (Brugertest.VisualPoints>Brugertest.KinaetetiskPoint
                && Brugertest.VisualPoints>Brugertest.laesendePoints) {
            opgave1_visuel_knap();

        }
        //Kinaetetiske opgaver
        if (Brugertest.KinaetetiskPoint>Brugertest.laesendePoints
                && Brugertest.KinaetetiskPoint>Brugertest.VisualPoints) {

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
    @SuppressLint("Range")
    private void prepareOpg2() {
        ImageButton opg2knap = (ImageButton) findViewById(R.id.opgave2_knap);
        if (opgaveDone == true) {
            opg2knap.setAlpha(100.00F);
        } else {
            opg2knap.setAlpha(68.00F);
        }

    }
}
