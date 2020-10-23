package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class BankRefund extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bank_refund);
    }

    public void refund(View v){
        Intent a = new Intent(this,RefundRequest.class);
        startActivity(a);
    }

    public void bankRefund(View v){
        Toast.makeText(BankRefund.this,"Successfully submitted!",Toast.LENGTH_SHORT).show();
        Intent a = new Intent(this,RefundRequest.class);
        startActivity(a);
    }
}