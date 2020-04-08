package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    SharedPreferences appIntro = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Knap der logger brugeren ind
        final Button LoginButton = (Button) findViewById(R.id.loginButton2);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(!Brugertest.gettestDone()){
                Intent LoginBruger = new Intent(getApplicationContext(), Brugerside.class);
                startActivity(LoginBruger);
                //Koden forneden sørger for man ikke kan komme tilbage til loginside
                finish();
            }
            else {
                Intent LoginBruger = new Intent(getApplicationContext(), BrugersideEfterTest.class);
                startActivity(LoginBruger);
            }

        }
        });
    }
}
