package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;

public class Vaelgopgaver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaelgopgaver);
        hjembtn();
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
}
