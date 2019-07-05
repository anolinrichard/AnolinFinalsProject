package com.example.richardrodulfo.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends Activity {

    TextView txtGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        txtGreeting = findViewById(R.id.tvGreeting);
        Intent intent = getIntent();
        String str = intent.getStringExtra("person");
        txtGreeting.setText("Welcome " + str + "!");
    }

    public void showPrograms(View v){
        Intent i2 = new Intent(this, programs.class);
        startActivity(i2);
    }


    public void showHistory(View v){
        Intent i3 = new Intent(this, history.class);
        startActivity(i3);
    }

    public void showLocation(View v){
        Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Pontifical+and+Royal+University+of+Santo+Tom%C3%A1s/@14.6095132,120.9898338,15z/data=!4m5!3m4!1s0x0:0xfff13cf2f4387bc9!8m2!3d14.6095132!4d120.9898338"));
        startActivity(i4);
    }

    public void onRet(View v){
        Intent i5 = new Intent(this, MainActivity.class);
        startActivity(i5);
    }
}

