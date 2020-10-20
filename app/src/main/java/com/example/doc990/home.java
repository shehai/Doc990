package com.example.doc990;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.doc990.ui.main.HomeFragment;
import com.google.android.material.navigation.NavigationView;

public class home extends AppCompatActivity {
    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, HomeFragment.newInstance())
                    .commitNow();
        }

        dl = (DrawerLayout)findViewById(R.id.container);
        t = new ActionBarDrawerToggle(this, dl,R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView)findViewById(R.id.nav_view);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
               /* switch(id)
                {
                    case R.id.account:

                        return true;
                }*/


                return true;
            }
        } );


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }


    public void goDoctors(View v){

        startActivity(new Intent(home.this,CheckDoctor.class));



    }


    public void goRecords(View v){

        startActivity(new Intent(home.this,record.class));



    }


    public void golabreports(View v){

        startActivity(new Intent(home.this,report.class));



    }


    public void gobookings(View v){

        startActivity(new Intent(home.this,BookingHistory.class));



    }

    public void gofaq(View v){

        startActivity(new Intent(home.this,Faq.class));



    }

    public void gorefund(View v){

        startActivity(new Intent(home.this,RefundRequest.class));



    }

    public void gotoprofile(View v){

        startActivity(new Intent(home.this,ProfileActivity.class));



    }

    public void gomedicine(View v){

        startActivity(new Intent(home.this,medicine.class));



    }








}