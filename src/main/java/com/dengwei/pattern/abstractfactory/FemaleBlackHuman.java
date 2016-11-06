package com.dengwei.pattern.abstractfactory;

/**
 * Created by dengwei on 16/11/6.
 */
public class FemaleBlackHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}
