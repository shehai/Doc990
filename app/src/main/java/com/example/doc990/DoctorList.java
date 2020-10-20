package com.example.doc990;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class DoctorList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DocListAdapter adapter;
    private ArrayList<DocModel> DoctorArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_doctor_list);
        addData();

        recyclerView = findViewById(R.id.recycler_view);

        adapter = new DocListAdapter(DoctorArrayList,getApplicationContext());

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DoctorList.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData() {
        DoctorArrayList= new ArrayList<>();
        DoctorArrayList.add(new DocModel("Dr. Archala Baladooriya", "Surgeon",R.drawable.doc_one));
        DoctorArrayList.add(new DocModel("Dr.Amandi Rathnayake", "Surgeon",R.drawable.doc_two));
        DoctorArrayList.add(new DocModel("Dr.Dr.A.Fouza", "Dental Surgeon",R.drawable.doc_three));
        DoctorArrayList.add(new DocModel("Dr.Anura Wijesinghe", "Opthamalogy",R.drawable.doc_four));
        DoctorArrayList.add(new DocModel("Dr.Asela Senanayake", "Urology",R.drawable.doctor_five));
        DoctorArrayList.add(new DocModel("Dr.Ashan Abeyewardhana", "Neuorology",R.drawable.doctor_six));
        DoctorArrayList.add(new DocModel("Dr.Daya De Silva", "Phsychiatry",R.drawable.doc_seven));
        DoctorArrayList.add(new DocModel("Dr.Hansi Wickramasinghe", "Psychiatry",R.drawable.doc_eight));
        DoctorArrayList.add(new DocModel("Dr.Indeewari Fernando", "Dental Surgeon",R.drawable.doc_nine));

    }

}