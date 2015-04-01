package com.ryan.practice.Mario;

/**
 * Created by carbo_000 on 3/30/2015.
 */
public class ConsolePrinter implements Method {

    private int height;

    public ConsolePrinter(int height) {
        this.height = height;
    }

    public void print() {
        String storage = Factory.calculate(height);
        System.out.println(storage);
    }

}
