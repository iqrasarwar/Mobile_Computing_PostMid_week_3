package com.example.lview;



public class Student {
    private String name;
    private  String id;
    private  String section;
    private  int imgid;

    public Student(String name, String id, String section, int imgid) {
        this.name = name;
        this.id = id;
        this.section = section;
        this.imgid = imgid;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSection() {
        return section;
    }

    public int getImgid() {
        return imgid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
