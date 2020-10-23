package com.example.doc990.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.doc990.CheckDoctor;
import com.example.doc990.R;
import com.example.doc990.SignUpActivity1;
import com.example.doc990.SignUpActivity2;
import com.example.doc990.medicine;
import com.example.doc990.offers;
import com.example.doc990.record;
import com.example.doc990.report;

public class HomeFragment extends Fragment {

   private ImageButton img1;
    private ImageButton img2;
    private ImageButton img3;
    private ImageButton img4;
    private ImageButton img5;
    private ImageButton img6;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        img1 = (ImageButton) root.findViewById(R.id.btn_doc);
        img2 = (ImageButton) root.findViewById(R.id.btn_record);
        img3 = (ImageButton) root.findViewById(R.id.btn_lab);
        img4 = (ImageButton) root.findViewById(R.id.btn_medicine);
        img5 = (ImageButton) root.findViewById(R.id.btn_health);
        img6 = (ImageButton) root.findViewById(R.id.btn_offer);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), CheckDoctor.class);
                startActivity(intent);
            }
        });


        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), record.class);
                startActivity(intent);
            }
        });


        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), report.class);
                startActivity(intent);
            }
        });


        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), medicine.class);
                startActivity(intent);
            }
        });


        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), CheckDoctor.class);
                startActivity(intent);
            }
        });


        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), offers.class);
                startActivity(intent);
            }
        });

        return root;
    }
}