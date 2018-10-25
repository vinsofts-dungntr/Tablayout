package com.tablayout.vinsofts.tablayoutviewpager.model;

public class Student {
    private String name;
    private int type;
    private String xepLoai;

    public Student(String name, String xepLoai) {
        this.name = name;
        this.xepLoai = xepLoai;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

}
