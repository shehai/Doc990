package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);


    }


   public void gotoho(View v){

       Toast toast=Toast. makeText(getApplicationContext(),"Login successfully",Toast. LENGTH_SHORT);

       toast. show();

        startActivity(new Intent(Login.this,Main2Activity.class));






    }


    public void gosignup(View v){

        startActivity(new Intent(Login.this,SignUpActivity1.class));



    }


   public void gohm(View v){

        startActivity(new Intent(Login.this,Main2Activity.class));



    }
}