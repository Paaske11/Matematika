package com.example.p2matematika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Brugertest extends AppCompatActivity {
    public static boolean testDone = false;
    public static int VisualPoints = 0;
    public static int laesendePoints = 0;
    public static int KinaetetiskPoint= 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brugertest);
        //Aktiverer knapperne
        dinprofilbtn();
        //afsluttest();


        //Jeppe går amok aka laver alle knapperne //
        //RADIOGROUP 1
        final RadioButton VisualAnswer1 = findViewById(R.id.Q1A1);
        final RadioButton LaesendeAnswer1 = findViewById(R.id.Q1A2);
        final RadioButton KinaetetiskAnswer1 = findViewById(R.id.Q1A3);

        //RADIOGROUP 2
        final RadioButton VisualAnswer2 = findViewById(R.id.Q2A1);
        final RadioButton LaesendeAnswer2 = findViewById(R.id.Q2A2);
        final RadioButton KinaetetiskAnswer2 = findViewById(R.id.Q2A3);

        //RADIOGROUP 3
        final RadioButton VisualAnswer3 = findViewById(R.id.Q3A1);
        final RadioButton LaesendeAnswer3 = findViewById(R.id.Q3A2);
        final RadioButton KinaetetiskAnswer3 = findViewById(R.id.Q3A3);

        //RADIOGROUP 4
        final RadioButton VisualAnswer4 = findViewById(R.id.Q4A1);
        final RadioButton LaesendeAnswer4 = findViewById(R.id.Q4A2);
        final RadioButton KinaetetiskAnswer4 = findViewById(R.id.Q4A3);

        //RADIOGROUP 5
        final RadioButton VisualAnswer5 = findViewById(R.id.Q5A1);
        final RadioButton LaesendeAnswer5 = findViewById(R.id.Q5A2);
        final RadioButton KinaetetiskAnswer5 = findViewById(R.id.Q5A3);



        //AFSLUT TEST KNAPPEN OSV //
        ImageButton Afsluttest = findViewById(R.id.afsluttest);
        Afsluttest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lige tusind ifs indtil jeg finder fix
                KinaetetiskPoint = 0;
                laesendePoints = 0;
                VisualPoints = 0;
                if(VisualAnswer1.isChecked()){
                    VisualPoints +=1;
                }
                if(VisualAnswer2.isChecked()){
                    VisualPoints +=1;
                }
                if(VisualAnswer3.isChecked()){
                    VisualPoints +=1;
                }
                if(VisualAnswer4.isChecked()){
                    VisualPoints +=1;
                }
                if(VisualAnswer5.isChecked()){
                    VisualPoints +=1;
                }
                if (LaesendeAnswer1.isChecked()) {
                    laesendePoints +=1;
                }
                if (LaesendeAnswer2.isChecked()) {
                    laesendePoints +=1;
                }
                if (LaesendeAnswer3.isChecked()) {
                    laesendePoints +=1;
                }
                if (LaesendeAnswer4.isChecked()) {
                    laesendePoints +=1;
                }
                if (LaesendeAnswer5.isChecked()) {
                    laesendePoints +=1;
                }
                if (KinaetetiskAnswer1.isChecked()) {
                    KinaetetiskPoint +=1;
                }
                if (KinaetetiskAnswer2.isChecked()) {
                    KinaetetiskPoint +=1;
                }
                if (KinaetetiskAnswer3.isChecked()) {
                    KinaetetiskPoint +=1;
                }
                if (KinaetetiskAnswer4.isChecked()) {
                    KinaetetiskPoint +=1;
                }
                if (KinaetetiskAnswer5.isChecked()) {
                    KinaetetiskPoint +=1;
                }

                if(VisualPoints > KinaetetiskPoint && VisualPoints > laesendePoints) {
                    testDone = true;
                    startActivity(new Intent(Brugertest.this, Dinlaeringsstilvisuel.class));
                }
                if(KinaetetiskPoint>VisualPoints && KinaetetiskPoint>laesendePoints){
                    testDone = true;
                    startActivity(new Intent(Brugertest.this, Dinlaeringsstilkinestaetisk.class));
                }
                if (laesendePoints>VisualPoints && laesendePoints > KinaetetiskPoint){
                    testDone = true;
                    startActivity(new Intent(Brugertest.this, Dinlaeringsstillaes.class));
                }
            }

        });

    }

    public void setTestDone(boolean newResult) {
       this.testDone = newResult;
    }

    public static boolean gettestDone() {
         return testDone;
    }

    //Knappen der fører tilbage til ens profil ses forneden
    private void dinprofilbtn() {
        Button dinprofilbtn = (Button) findViewById(R.id.DinProfilbtn);
        dinprofilbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    startActivity(new Intent(Brugertest.this, BrugersideEfterTest.class));
            }
        });

    }

}
