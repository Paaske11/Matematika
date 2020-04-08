package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Forklarkinestaetisk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forklarkinestaetisk);
    }

    private void dinprofil() {
        final ImageButton dinprofil = (ImageButton) findViewById(R.id.dinprofil);
        dinprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Forklarkinestaetisk.this, BrugersideEfterTest.class));
            }
        });
    }
}
