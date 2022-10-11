package com.example.lview;



public class Student {
    private String name;
    private  String rollNo;
    private  String section;
//    private  int imgid;

    public Student(String name, String id, String section) {
        this.name = name;
        this.rollNo = id;
        this.section = section;
//        this.imgid = imgid;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getSection() {
        return section;
    }

//    public int getImgid() {
//        return imgid;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.rollNo = id;
    }

    public void setSection(String section) {
        this.section = section;
    }

//    public void setImgid(int imgid) {
//        this.imgid = imgid;
//    }
}
