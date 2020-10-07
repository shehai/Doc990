package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.doc990.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

                private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button7);
        button.setOnClickListener(this);

        button = findViewById(R.id.button8);
        button.setOnClickListener(this);

        button = findViewById(R.id.button9);
        button.setOnClickListener(this);
//
//        Intent intent =new Intent(this,AddAboutUs.class);
//        startActivity(intent);
    }
    public  void onClick(View view) {
        switch (view.getId()) {
            case R.id.button7:

            case R.id.button8:

            case R.id.button9:
                Intent intent1 = new Intent(MainActivity.this, booking.class);
                startActivity(intent1);
                break;
        }


    }}
