package com.ryan.practice.Mario;

/**
 * Created by carbo_000 on 3/13/2015.
 */
public class Factory {

    private Factory() {}

    private static Factory factory;

    public static Factory getInstance() {
        if(factory == null) {
            factory = new Factory();
        }
        return factory;
    }

    public void run(int option, int height) {

        String storage = "";
        int blockCounter = 2;

        for(int i = 0; i < height; i++) {

            for(int j = height; j > blockCounter-1; j--) {
                storage = storage + " ";
            }
            for(int k = 0; k < blockCounter; k++) {
                storage = storage +"#";
            }
            blockCounter++;
            storage = storage + "\n";
        }


        Printer p = new Printer(option, storage);
        p.print();
    }
}
