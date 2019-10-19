package com.example.mad314_1896531_pa2;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
public TextView Name, Id;

public StudentViewHolder(View itemView){
super(itemView);
Id = itemView.findViewById(R.id.tvId);
Name = itemView.findViewById(R.id.tvName);
}
}
