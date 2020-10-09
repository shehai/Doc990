package com.example.doc990;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class SpecialistAdapter extends RecyclerView.Adapter<SpecialistAdapter.SpecialistViewHolder>{

    private ArrayList<Specialist> dataList;

    public SpecialistAdapter(ArrayList<Specialist> dataList) {
        this.dataList = dataList;
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

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public static class SpecialistViewHolder extends RecyclerView.ViewHolder{

        private TextView title,des;
        private CircleImageView image;
        public SpecialistViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.txt_title);
            des = itemView.findViewById(R.id.txt_des);
            image = itemView.findViewById(R.id.prof_image);
        }
    }
}
