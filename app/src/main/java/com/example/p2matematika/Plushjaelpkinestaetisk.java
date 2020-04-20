package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Plushjaelpkinestaetisk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plushjaelpkinestaetisk);
        tilbage();
    }
    private void tilbage() {
        ImageButton tilbage = (ImageButton) findViewById(R.id.Tilbage);
        tilbage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plushjaelpkinestaetisk.this, Pluskinestaetisk.class));
            }
        });
    }
}
