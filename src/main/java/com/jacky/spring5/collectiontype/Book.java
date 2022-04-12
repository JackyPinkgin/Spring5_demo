package com.jacky.spring5.collectiontype;

import java.util.List;

/**
 * 2022/4/2
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
