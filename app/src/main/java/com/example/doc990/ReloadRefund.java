package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class ReloadRefund extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_reload_refund);


        button = findViewById(R.id.dialog_button);

    }
    public void refundReq(View v){
        Intent a = new Intent(this,RefundRequest.class);
        startActivity(a);
    }

    public void Successful(View v){
        Toast.makeText(ReloadRefund.this,"Successfully submitted!",Toast.LENGTH_SHORT).show();
        Intent a = new Intent(this,RefundRequest.class);
        startActivity(a);
    }
}