package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Brugertest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brugertest);
        dinprofilbtn();
    }
    private void dinprofilbtn() {
        Button dinprofilbtn = (Button) findViewById(R.id.DinProfilbtn);
        dinprofilbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Brugertest.this, Brugerside.class));
            }
        });

    }
}
