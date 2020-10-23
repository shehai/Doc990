package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class RefundRequest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_refund_request);
    }

    public void home(View v){
        Intent a = new Intent(this,Main2Activity.class);
        startActivity(a);
    }

    public void bankRefund(View v){
        Intent b = new Intent(this,BankRefund.class);
        startActivity(b);
    }

    public void reloadRefund(View v){
        Intent c = new Intent(this,ReloadRefund.class);
        startActivity(c);
    }

    public void refundSearch(View v){
        Intent d = new Intent(this,RefundSearch.class);
        startActivity(d);
    }
}