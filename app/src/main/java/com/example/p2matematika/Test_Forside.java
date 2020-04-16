package com.example.p2matematika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Test_Forside extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test__forside);
        startTesten();
        hjemknap();
    }

    public void startTesten(){
        ImageButton tagTesten = (ImageButton) findViewById(R.id.Tag_Testen_Knap);
        tagTesten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Test_Forside.this, Brugertest.class));
            }
        });
    }
    public void hjemknap() {
        ImageButton hjemknap = (ImageButton) findViewById(R.id.hjembtn3);
        hjemknap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Test_Forside.this, BrugersideEfterTest.class));
            }
        });
    }
}
