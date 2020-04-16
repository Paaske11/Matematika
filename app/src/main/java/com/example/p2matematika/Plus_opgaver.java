package com.example.p2matematika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Plus_opgaver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus_opgaver);
        hjembtn();
    }

    private void hjembtn() {
        final ImageButton hjemtbtn = (ImageButton) findViewById(R.id.hjembtn2);
        hjemtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plus_opgaver.this, BrugersideEfterTest.class));
            }
        });
    }
}
