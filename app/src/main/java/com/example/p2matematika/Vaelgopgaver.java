package com.example.p2matematika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Vaelgopgaver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaelgopgaver);
        hjembtn();
        PlusOpgaveKnap();
    }

    private void hjembtn() {
        final ImageButton hjemtbtn = (ImageButton) findViewById(R.id.hjembtn);
        hjemtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Vaelgopgaver.this, BrugersideEfterTest.class));
            }
        });
    }
    private void PlusOpgaveKnap() {
        ImageButton PlusKnap = (ImageButton) findViewById(R.id.plusbtn);
        PlusKnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Vaelgopgaver.this, Plus_opgaver.class));
            }
        });
    }
}
