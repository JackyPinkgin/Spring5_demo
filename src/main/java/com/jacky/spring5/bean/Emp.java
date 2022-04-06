package com.jacky.spring5.bean;

/**
 * 2022/4/2
 */
public class Emp {
    private String ename;
    private String gender;

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void add(){
        System.out.println(ename + " " + gender + " " + dept);
    }
}
