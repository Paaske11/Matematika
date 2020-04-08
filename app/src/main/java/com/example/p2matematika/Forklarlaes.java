package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Forklarlaes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forklarlaes);
        hjembtn();
    }

    private void hjembtn() {
        ImageButton hjembtn = (ImageButton) findViewById(R.id.hjembtn);
        hjembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Forklarlaes.this, BrugersideEfterTest.class));
            }
        });
    }
}