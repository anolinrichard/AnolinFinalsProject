package com.example.richardrodulfo.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pharma extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharma);
    }

    public void onReturn(View v){
        Intent i = new Intent(this,programs.class);
        startActivity(i);
    }
}
