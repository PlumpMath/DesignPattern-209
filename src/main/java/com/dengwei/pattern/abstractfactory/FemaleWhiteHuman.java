package com.dengwei.pattern.abstractfactory;

/**
 * Created by dengwei on 16/11/6.
 */
public class FemaleWhiteHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("白人女性");
    }
}
