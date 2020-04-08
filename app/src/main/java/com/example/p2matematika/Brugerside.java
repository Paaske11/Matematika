package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Brugerside extends AppCompatActivity {
    public double alpha = 0.3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brugerside);


        final Button Logudbtn = (Button) findViewById(R.id.Logudbtn);
        Logudbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LogudIntet = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(LogudIntet);
                finish();
            }
        });
        final ImageButton TagtestBtn = (ImageButton) findViewById(R.id.TagTestbtn);
        TagtestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Brugerside.this, Brugertest.class));
            }
        });
    }
}
