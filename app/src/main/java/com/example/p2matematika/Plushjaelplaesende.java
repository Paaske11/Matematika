package com.example.p2matematika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Plushjaelplaesende extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plushjaelplaesende);
        tilbage();
    }

    private void tilbage() {
        ImageButton tilbage = (ImageButton) findViewById(R.id.Tilbage);
        tilbage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plushjaelplaesende.this, Opgave1_laes.class));
            }
        });
    }
}
