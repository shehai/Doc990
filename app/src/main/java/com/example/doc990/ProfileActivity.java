package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    Button update;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profile);

        Spinner myspinner=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(ProfileActivity.this,

                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.titles)

        );
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAdapter);

        Spinner myspinne=(Spinner) findViewById(R.id.spinne);

        ArrayAdapter<String> cAdapter = new ArrayAdapter<String>(ProfileActivity.this,

                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.countries)

        );
        cAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinne.setAdapter(cAdapter);



                update = (Button) findViewById(R.id. btn_updateProf);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast=Toast. makeText(getApplicationContext(),"Profile updated successfully",Toast. LENGTH_SHORT);

                toast. show();
        }
        });
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

    public void   onGenderRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        EditText ed =(EditText) findViewById(R.id.nic_pass);

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id. radio_male:
                if (checked)
                    // Pirates are the best

                break;
            case R.id. radio_female:
                if (checked)
                 //
                break;
        }
    }



   public void goho(View v){

        startActivity(new Intent(ProfileActivity.this,Main2Activity.class));



    }


    public void changepwd(View v){

        startActivity(new Intent(ProfileActivity.this,ChangePwdActivity.class));



    }
}