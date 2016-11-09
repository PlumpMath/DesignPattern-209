package com.dengwei.pattern.strategy;

/**
 * 孙夫人断后
 * Created by dengwei on 16/11/6.
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后,挡住追兵..");
    }
}
