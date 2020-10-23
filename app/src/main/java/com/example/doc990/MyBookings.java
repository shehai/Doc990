package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MyBookings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_my_bookings);
    }

    /*public void home(View v){
        Intent i = new Intent(this,home.class);
        startActivity(i);
    }*/

    public void bookingHistory(View v){
        Intent a = new Intent(this,BookingHistory.class);
        startActivity(a);
    }

    public void checkNum(View v){
        Intent b = new Intent(this,CheckOngoingNum.class);
        startActivity(b);
    }

    public void downloadReceipt(View v){
        Intent c = new Intent(this,DownloadReceipt.class);
        startActivity(c);
    }

    public void resendSMS(View v){
        Intent d = new Intent(this,ResendBookingSms.class);
        startActivity(d);
    }

    public void rebook(View v){
        Intent d = new Intent(this,CheckDoctor.class);
        startActivity(d);
    }
}
