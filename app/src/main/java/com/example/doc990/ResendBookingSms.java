package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class ResendBookingSms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_resend_booking_sms);
    }

    public void myBookings(View v){
        Intent a = new Intent(this,MyBookings.class);
        startActivity(a);
    }

    public void Successful(View v){
        Toast.makeText(ResendBookingSms.this,"Successful!",Toast.LENGTH_SHORT).show();
    }

}