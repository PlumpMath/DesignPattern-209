package com.dengwei.pattern.abstractfactory;

/**
 * Created by dengwei on 16/11/6.
 */
public class MaleBlackHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
