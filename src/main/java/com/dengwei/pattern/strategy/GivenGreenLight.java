package com.dengwei.pattern.strategy;

/**
 * 吴国太开绿灯
 * Created by dengwei on 16/11/6.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行..");
    }
}
