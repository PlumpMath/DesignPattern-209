package com.dengwei.pattern.abstractfactory;

/**
 * Created by dengwei on 16/11/6.
 */
public class MaleWhiteHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
