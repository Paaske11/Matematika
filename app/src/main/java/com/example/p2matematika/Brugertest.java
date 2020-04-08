package com.example.p2matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.nio.channels.InterruptedByTimeoutException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Brugertest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brugertest);
        dinprofilbtn();
        afsluttest();
    }

    //Knappen der fører tilbage til ens profil ses forneden
    private void dinprofilbtn() {
        Button dinprofilbtn = (Button) findViewById(R.id.DinProfilbtn);
        dinprofilbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Brugertest.this, Brugerside.class));
            }
        });

    }
    private void afsluttest() {
        final ImageButton afsluttest = (ImageButton) findViewById(R.id.afsluttest);
        afsluttest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Brugertest.this,BrugersideEfterTest.class));

                }


        });

    }
}
