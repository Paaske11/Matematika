package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dinlaeringsstilkinestaetisk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinlaeringsstilkinestaetisk);
        dinside();
    }

    private void dinside() {
        final ImageButton dinside = (ImageButton) findViewById(R.id.dinsidebtn);
        dinside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dinlaeringsstilkinestaetisk.this, BrugersideEfterTest.class));
            }
        });
    }
}
