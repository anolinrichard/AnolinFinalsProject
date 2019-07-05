package com.example.richardrodulfo.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class programs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
    }

    public void onPharma(View v){
        Intent i = new Intent(this, pharma.class);
        startActivity(i);
    }

    public void onEngg(View v){
        Intent i2 = new Intent(this, engg.class);
        startActivity(i2);
    }

    public void onEduc(View v){
        Intent i3 = new Intent(this, educ.class);
        startActivity(i3);
    }

    public void onSci(View v){
        Intent i4 = new Intent(this, science.class);
        startActivity(i4);
    }

    public void onComm(View v){
        Intent i5 = new Intent(this, comm.class);
        startActivity(i5);
    }

    public void onMusic(View v){
        Intent i6 = new Intent(this, music.class);
        startActivity(i6);
    }

    public void onAb(View v){
        Intent i7 = new Intent(this, arts.class);
        startActivity(i7);
    }
    public void onCfad(View v){
        Intent i8 = new Intent(this, cfad.class);
        startActivity(i8);
    }
    public void onArki(View v){
        Intent i9 = new Intent(this, arki.class);
        startActivity(i9);
    }
    public void onCthm(View v){
        Intent i10 = new Intent(this, cthm.class);
        startActivity(i10);
    }
    public void onNurs(View v){
        Intent i11 = new Intent(this, nurs.class);
        startActivity(i11);
    }
    public void onCrs(View v){
        Intent i12 = new Intent(this, crs.class);
        startActivity(i12);
    }
    public void onIpea(View v){
        Intent i13 = new Intent(this, ipea.class);
        startActivity(i13);
    }
    public void onAmv(View v){
        Intent i14 = new Intent(this, amv.class);
        startActivity(i14);
    }
    public void onIcs(View v){
        Intent i15 = new Intent(this, ics.class);
        startActivity(i15);
    }
    public void onReturn(View v){
        Intent i16 = new Intent(this, Menu.class);
        startActivity(i16);
    }
}
