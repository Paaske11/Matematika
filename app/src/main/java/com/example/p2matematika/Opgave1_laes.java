package com.example.p2matematika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Opgave1_laes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_opgave1_laes);
        hjemknap();
        tilbageknap();
        hjaelpknap();
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
}
