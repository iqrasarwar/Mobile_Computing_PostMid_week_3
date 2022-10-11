package com.example.lview;

public class studentModel {
    public String Name;
    public int rollNo;
    public boolean isEnrolled;
    public int Id;

    public studentModel(String name, int rollNo, boolean isEnrolled) {
        this.Name = name;
        this.rollNo = rollNo;
        this.isEnrolled = isEnrolled;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRoll() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }
}

