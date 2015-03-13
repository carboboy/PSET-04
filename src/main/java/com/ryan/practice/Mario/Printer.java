package com.ryan.practice.Mario;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by carbo_000 on 3/13/2015.
 */
public class Printer {

    private int option;
    private String storage = "";

    public Printer(int option, String storage) {
        this.option = option;
        this.storage = storage;
    }

    public void print() {
        if(option == 1) {
            System.out.print(storage);
        } else if(option == 2) {
            try {
                PrintWriter pw = new PrintWriter("mario.txt","UTF-8");
                pw.write(storage);
                pw.close();
            } catch(FileNotFoundException fnfe) {

            } catch(UnsupportedEncodingException uee) {

            }
        }
    }
}
