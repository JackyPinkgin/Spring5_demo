package com.jacky.spring5.bean;

/**
 * 2022/4/8
 */
public class Orders {
    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
    }

    public void initMethod(){
        System.out.println("bean的初始化方法");
    }

    public void destoryMethod(){
        System.out.println("bean的销毁方法");
    }
}
