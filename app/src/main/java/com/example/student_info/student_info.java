package com.example.student_info;

public class student_info {
    String name, id, expertise, university;

    public student_info(String name, String id, String expertise, String university) {
        this.id = id;
        this.name = name;
        this.expertise = expertise;
        this.university = university;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
