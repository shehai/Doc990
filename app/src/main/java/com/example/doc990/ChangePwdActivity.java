package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class ChangePwdActivity extends AppCompatActivity {

    Button pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_change_pwd);

        pwd = (Button) findViewById(R.id.btn_update);

        pwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast=Toast. makeText(getApplicationContext(),"password changed successfully",Toast. LENGTH_SHORT);

                toast. show();
            }
        });
    }



    public void  gotoprof(View v){

        startActivity(new Intent(ChangePwdActivity.this,ProfileActivity.class));



    }
}