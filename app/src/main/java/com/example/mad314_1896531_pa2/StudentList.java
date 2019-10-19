package com.example.mad314_1896531_pa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class StudentList extends AppCompatActivity {
    RecyclerView rvStudents;
    private StudentAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        rvStudents = findViewById(R.id.rvStudents);
        layoutManager = new LinearLayoutManager(this);
        rvStudents.setLayoutManager(layoutManager);

        mAdapter = new StudentAdapter(getApplicationContext());
        rvStudents.setAdapter(mAdapter);

        final StudentRepository repository = StudentRepository.getInstance();

        mAdapter.update();
    }
}
