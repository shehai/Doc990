package com.example.doc990;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class SpecialistAdapter extends RecyclerView.Adapter<SpecialistAdapter.SpecialistViewHolder>{

    private ArrayList<Specialist> dataList;
    Context context;

    public SpecialistAdapter(ArrayList<Specialist> dataList,Context context) {

        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public SpecialistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row, parent, false);
        return new SpecialistViewHolder(view);
    }
 
    @Override
    public void onBindViewHolder(@NonNull SpecialistViewHolder holder, int position) {

        holder.title.setText(dataList.get(position).getTitle());
        holder.des.setText(dataList.get(position).getDes());
        holder.image.setImageResource(dataList.get(position).getImg());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context,DoctorList.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent1);
            }
        });

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public static class SpecialistViewHolder extends RecyclerView.ViewHolder{

        private TextView title,des;
        private CircleImageView image;
        private CardView card;
        public SpecialistViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.txt_title);
            des = itemView.findViewById(R.id.txt_des);
            image = itemView.findViewById(R.id.prof_image);
            card = itemView.findViewById(R.id.card);
        }
    }
}
