package com.example.p2matematika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Forklarkinestaetisk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forklarkinestaetisk);
        dinprofil();
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
