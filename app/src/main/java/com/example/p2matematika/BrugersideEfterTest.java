package com.example.p2matematika;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BrugersideEfterTest extends AppCompatActivity {



    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_brugerside_efter_test);


            logud();
            tagtesten();


        // Skifter alpha, og gør de andre knapper brugelige
        if (Brugertest.testDone == true) {
            ImageButton OpgaveKnap = (ImageButton) findViewById(R.id.OpgaverBtn);
            ImageButton Laeringknap = (ImageButton) findViewById(R.id.LaeringBtn);
            OpgaveKnap.setAlpha(100.0F);
            Laeringknap.setAlpha(100.0F);
            Laeringsstil();
        }
        }
        

        // LogudKnappen
        public void logud() {
            final Button Logudbtn = (Button) findViewById(R.id.Logudbtn);
            Logudbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent LogudIntet = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(LogudIntet);
                    finish();
                }
            });
        }
        //Tag testen igen knap
        public void tagtesten() {
        final ImageButton TagtestBtn = (ImageButton) findViewById(R.id.TagTestbtn);
        TagtestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BrugersideEfterTest.this, Test_Forside.class));

            }
        });

    }

    public void Laeringsstil() {
        ImageButton LaeringsBTN = (ImageButton) findViewById(R.id.LaeringBtn);
        ImageButton OpgaveBTN = (ImageButton) findViewById(R.id.OpgaverBtn);

            //Hvis læringsstil == noget
        LaeringsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Brugertest.VisualPoints> Brugertest.KinaetetiskPoint
                        && Brugertest.VisualPoints > Brugertest.laesendePoints ) {
                    startActivity(new Intent(BrugersideEfterTest.this, Forklarvisuel.class));
                }
                if(Brugertest.laesendePoints> Brugertest.KinaetetiskPoint
                        && Brugertest.laesendePoints> Brugertest.VisualPoints ) {
                    startActivity(new Intent(BrugersideEfterTest.this, Forklarlaes.class));
                }
                if(Brugertest.KinaetetiskPoint> Brugertest.laesendePoints
                        && Brugertest.KinaetetiskPoint> Brugertest.VisualPoints ) {
                    startActivity(new Intent(BrugersideEfterTest.this, Forklarkinestaetisk.class));
                }

            }
        });

        OpgaveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BrugersideEfterTest.this, Vaelgopgaver.class));
            }
        });
    }
}
