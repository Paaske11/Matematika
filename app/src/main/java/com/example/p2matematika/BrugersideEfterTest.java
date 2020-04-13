package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BrugersideEfterTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brugerside_efter_test);

        logud();
        tagtesten();
        Laeringsstil();
        


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
                startActivity(new Intent(BrugersideEfterTest.this, Brugertest.class));

            }
        });

    }

    public void Laeringsstil() {
        ImageButton LaeringsBTN = (ImageButton) findViewById(R.id.LaeringBtn);
        ImageButton OpgaveBTN = (ImageButton) findViewById(R.id.OpgaverBtn);

        LaeringsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BrugersideEfterTest.this, Forklarlaes.class));
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
