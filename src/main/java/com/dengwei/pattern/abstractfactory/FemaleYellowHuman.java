package com.dengwei.pattern.abstractfactory;

/**
 * Created by dengwei on 16/11/6.
 */
public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人女性");
    }
}
