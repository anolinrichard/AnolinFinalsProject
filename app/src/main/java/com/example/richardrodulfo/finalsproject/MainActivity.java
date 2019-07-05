package com.example.richardrodulfo.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.etName);
    }

    public void nextPage(View v){
        String name = txtName.getText().toString();
        Intent i = new Intent(this, Menu.class);
        i.putExtra("person",name);
        startActivity(i);
    }

    public void onSave(View v){
        Toast toast = Toast.makeText(this,"Saved Successfully",Toast.LENGTH_LONG);
        toast.show();
    }

}
