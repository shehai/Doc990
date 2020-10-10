package com.example.doc990;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class DocListAdapter extends RecyclerView.Adapter<DocListAdapter.DocListtViewHolder>{

    private ArrayList<DocModel> dataList;
    Context context;

    public DocListAdapter(ArrayList<DocModel> dataList,Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public DocListtViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.doc_list, parent, false);
        return new DocListtViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DocListtViewHolder holder, int position) {

        holder.title.setText(dataList.get(position).getTitle());
        holder.des.setText(dataList.get(position).getDes());
        holder.image.setImageResource(dataList.get(position).getImg());
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent1 = new Intent(context,MainActivity.class);
               intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent1);
            }
        });


    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public static class DocListtViewHolder extends RecyclerView.ViewHolder{

        private TextView title,des;
        private CircleImageView image;
        private Button btn;
        public DocListtViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.txt_title);
            des = itemView.findViewById(R.id.txt_des);
            image = itemView.findViewById(R.id.prof_image);
            btn = itemView.findViewById(R.id.channel);
        }
    }

}
