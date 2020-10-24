package com.example.doc990;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class medicine extends AppCompatActivity {

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_medicine);

        submit = findViewById(R.id.submit_btn);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(medicine.this, "Success",Toast.LENGTH_LONG).show();

                Intent d = new Intent(medicine.this,Main2Activity.class);
                startActivity(d);

            }
        });

    }
 /*   public void click(View v){

        Toast.makeText(this, "Success",Toast.LENGTH_LONG).show();

        Intent d = new Intent(this,Main2Activity.class);
        startActivity(d);
    }*/



}