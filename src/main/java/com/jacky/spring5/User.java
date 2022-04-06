package com.jacky.spring5;

/**
 * 2022/3/31
 */
public class User {
    private int age;
    private String userName;

    public User(int age, String userName) {
        this.age = age;
        this.userName = userName;
    }

    public User() {
    }

    public void add(int num){
        System.out.println(num+" ...");
    }
}
