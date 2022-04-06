package com.jacky.spring5;

/**
 * 2022/3/31
 */
public class Book {

    private String bName;
    private String bAuthor;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void testDemo() {
        System.out.println(bName + " " + bAuthor + " " + address);
    }

}
