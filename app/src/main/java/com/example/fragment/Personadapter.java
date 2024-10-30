package com.example.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Personadapter extends RecyclerView.Adapter<Personadapter.ViewHolder> {
    private ArrayList<Person> list;
    ItemSelcted activity;



    public interface ItemSelcted{
        void onItemSelected(int index);
    }
    public Personadapter(Context context,ArrayList<Person>list){
        this.list=list;
        activity=(ItemSelcted) context;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvName;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            tvName=itemView.findViewById(R.id.tvName);
            imageView = itemView.findViewById(R.id.imageview3);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activity.onItemSelected(list.indexOf(view.getTag()));
                }
            });
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setTag(list.get(position));
        holder.tvName.setText(list.get(position).getName());
        if (list.get(position).getImage() != 0) {
            holder.imageView.setImageResource(list.get(position).getImage());
        } else {
            holder.imageView.setImageResource(R.drawable.baseline_account_box_24);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
