package com.example.doc990;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doc990.R;

public class booking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
    }

    public  void onClick(View view){

        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);

        Context context = getApplicationContext();
        CharSequence msg = "Booking Made successfully";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }
}

