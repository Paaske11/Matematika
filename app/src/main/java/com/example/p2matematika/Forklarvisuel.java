package com.example.p2matematika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Forklarvisuel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forklarvisuel);
        hjem();
    }

    private void hjem(){
        ImageButton hjem = (ImageButton) findViewById(R.id.hjembtn);
        hjem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Forklarvisuel.this,BrugersideEfterTest.class));
            }
        });
    }
}
