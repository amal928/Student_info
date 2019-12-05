package com.example.student_info;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<student_info> student_list = new ArrayList<>();
    RecyclerView student_rv;
    InfoAdapter infoAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        student_rv = findViewById(R.id.student_rv);
        student_rv.setLayoutManager(new LinearLayoutManager(this));
        infoAdapter = new InfoAdapter(this, student_list);
        student_rv.setAdapter(infoAdapter);
    }

    private void initData() {
        student_list.add(new student_info("amal", "123", "i have some expertise in developing ", "al azhar university "));
        student_list.add(new student_info("ahmed", "456", "i have some expertise in arabic ", "al azhar university "));
        student_list.add(new student_info("samira", "789", "i have some expertise in fashion   ", "al azhar university "));
        student_list.add(new student_info("karem", "159", "i have some expertise in design ", "al azhar university "));
        student_list.add(new student_info("hala", "357", "i have some expertise in", "al azhar university "));
        student_list.add(new student_info("kamal", "9731", "i have some expertise in architecture ", "al azhar university "));
        student_list.add(new student_info("amal", "123", "i have some expertise in developing ", "al azhar university "));
        student_list.add(new student_info("ahmed", "456", "i have some expertise in arabic ", "al azhar university "));
        student_list.add(new student_info("samira", "789", "i have some expertise in fashion   ", "al azhar university "));
        student_list.add(new student_info("karem", "159", "i have some expertise in design ", "al azhar university "));
        student_list.add(new student_info("hala", "357", "i have some expertise in", "al azhar university "));
        student_list.add(new student_info("kamal", "9731", "i have some expertise in architecture ", "al azhar university "));


    }
}
