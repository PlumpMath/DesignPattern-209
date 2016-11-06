package com.dengwei.pattern.builder;

import java.util.ArrayList;

/**
 * Created by dengwei on 16/11/6.
 */
public class Client {
    public static void main(String[] args) {
        BenzModel benz = new BenzModel();

        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        benz.setSequence(sequence);
        benz.run();
    }
}
