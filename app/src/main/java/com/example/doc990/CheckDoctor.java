package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class CheckDoctor extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SpecialistAdapter adapter;
    private ArrayList<Specialist> specialistArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_check_doctor);

        addData();

        recyclerView = findViewById(R.id.recycler_view);

        adapter = new SpecialistAdapter(specialistArrayList,getApplicationContext());

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(CheckDoctor.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData() {
        specialistArrayList= new ArrayList<>();
        specialistArrayList.add(new Specialist("Ophthalmology", "problem related to eyes",R.drawable.eye));
        specialistArrayList.add(new Specialist("Neurology", "Problems related to brain, spine and muscle related problems",R.drawable.human_body));
        specialistArrayList.add(new Specialist("Psychiatry", "Mental health of patients",R.drawable.brain));
        specialistArrayList.add(new Specialist("Dental Care", "Dental problems",R.drawable.tooth));
        specialistArrayList.add(new Specialist("Hearing and speech Therapys", "Hearing and speech issues",R.drawable.ear));
        specialistArrayList.add(new Specialist("Urology", "Diseases of the male and female urinary tract.",R.drawable.kidneys));
        specialistArrayList.add(new Specialist("General,Bariatric & Cosmetic Surgery", "Scars, obesity, pain, abdomen, subcutaneous swelling",R.drawable.stomach));
        specialistArrayList.add(new Specialist("Gastroenterology", "Compllaints related to stomach,intestine, liver and pancreas",R.drawable.stomach_gas));
        specialistArrayList.add(new Specialist("Pulmnology", "Problems related to lungs and lung tumors",R.drawable.lungs));

    }

}