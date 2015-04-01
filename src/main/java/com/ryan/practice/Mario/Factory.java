package com.ryan.practice.Mario;

/**
 * Created by carbo_000 on 3/13/2015.
 */
public class Factory {

    private String option;

    public Factory(String option) {
        this.option = option;
    }


    public void run(int height) {

        Method m;

        if(Integer.parseInt(option) == 1) {
            m = new ConsolePrinter(height);
            m.print();
        } else if(Integer.parseInt(option) == 2) {
            m = new FilePrinter(height);
            m.print();
        } else {
            System.out.println("Please try again and insert proper values");
        }
    }

    public static String calculate(int height) {
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
        return storage;
    }
}
