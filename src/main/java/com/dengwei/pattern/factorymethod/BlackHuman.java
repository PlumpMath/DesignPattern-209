package com.dengwei.pattern.factorymethod;

/**
 * Created by dengwei on 16/11/6.
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的.. ");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说哈,一般人听不懂");
    }
}
