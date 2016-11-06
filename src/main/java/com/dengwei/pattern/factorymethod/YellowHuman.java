package com.dengwei.pattern.factorymethod;

/**
 * Created by dengwei on 16/11/6.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的... ");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会刷回,一般说的都是双字节...");
    }

}
