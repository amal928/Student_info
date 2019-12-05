package com.example.student_info;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class student extends AppCompatActivity {
    TextView studentid, studentname, studentuniversity, studentexpertise;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        studentid = findViewById(R.id.studentid);
        studentname = findViewById(R.id.studentname);
        studentuniversity = findViewById(R.id.studentuniversity);
        studentexpertise = findViewById(R.id.studentexpertise);


        String id = getIntent().getStringExtra("id");
        String name = getIntent().getStringExtra("name");
        String expertise = getIntent().getStringExtra("expertise");
        String university = getIntent().getStringExtra("university");


        studentid.setText("Student ID:  " + id);
        studentname.setText("Student Name: " + name);
        studentuniversity.setText("University Name: " + university);
        studentexpertise.setText("Student Expertise: " + expertise);


    }
}

