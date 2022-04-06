package com.jacky.spring5;

/**
 * 2022/4/2
 */
public class Orders {
    private String oName;
    private String address;

    public Orders(String oName, String address) {
        this.oName = oName;
        this.address = address;
    }

    public void ordersTest() {
        System.out.println(oName + "::" + address);
    }
}
