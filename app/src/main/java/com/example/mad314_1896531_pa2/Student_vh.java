package com.example.mad314_1896531_pa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Student_vh extends RecyclerView.ViewHolder {
    public TextView tvName, tvId;
    public Student_vh(View itemView){
        super(itemView);
        tvId = itemView.findViewById(R.id.tvId);
        tvName = itemView.findViewById(R.id.tvName);
    }
}
