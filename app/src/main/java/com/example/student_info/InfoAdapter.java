package com.example.student_info;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.Student_infoVh> {


    Context context;
    List<student_info> studentInfo;

    public InfoAdapter(Context context, List<student_info> studentInfo) {
        this.context = context;
        this.studentInfo = studentInfo;
    }

    @NonNull
    @Override
    public Student_infoVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.student_row, parent, false);
        return new Student_infoVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Student_infoVh holder, int position) {
        holder.setData(studentInfo.get(position));

    }


    @Override
    public int getItemCount() {
        return studentInfo.size();
    }


    public class Student_infoVh extends RecyclerView.ViewHolder {
        TextView name, id, expertise, university;

        public Student_infoVh(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            id = itemView.findViewById(R.id.id);
            expertise = itemView.findViewById(R.id.expertise);
            university = itemView.findViewById(R.id.university);

        }

        public void setData(final student_info student_info) {
            name.setText(student_info.getName());
            id.setText(student_info.getId());
            expertise.setText(student_info.getExpertise());
            university.setText(student_info.getUniversity());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(itemView.getContext(), student.class);
                    intent.putExtra("id", student_info.getId());
                    intent.putExtra("name", student_info.getName());
                    intent.putExtra("expertise", student_info.getExpertise());
                    intent.putExtra("university", student_info.getUniversity());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
