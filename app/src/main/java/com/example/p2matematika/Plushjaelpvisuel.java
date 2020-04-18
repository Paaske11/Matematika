package com.example.p2matematika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Plushjaelpvisuel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plushjaelpvisuel);
        tilbage();
    }

    private void tilbage(){
        ImageButton tilbageknap = (ImageButton) findViewById(R.id.Tilbage);
        tilbageknap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plushjaelpvisuel.this, opgave1_visuel.class));
            }
        });
    }
}
