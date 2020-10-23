package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUpActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up3);

        Spinner myspinner=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(SignUpActivity3.this,

                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.titles)

                );
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAdapter);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        EditText ed =(EditText) findViewById(R.id.nic_pass);

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    // Pirates are the best
                    ed.setHint("NIC");
                    break;
            case R.id.radio_ninjas:
                if (checked)
                    ed.setHint("Passport");
                    break;
        }
    }


    public void gotohome(View v){

        Toast toast=Toast. makeText(getApplicationContext(),"Create account successfully",Toast. LENGTH_SHORT);

        toast. show();


        startActivity(new Intent(SignUpActivity3.this,Main2Activity.class));



    }

    public void gosign(View v){

        startActivity(new Intent(SignUpActivity3.this,SignUpActivity2.class));



    }
}