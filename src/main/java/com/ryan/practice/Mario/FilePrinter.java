package com.ryan.practice.Mario;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by carbo_000 on 3/30/2015.
 */
public class FilePrinter implements Method {

    private int height;

    public FilePrinter(int height) {
        this.height = height;
    }

    public void print() {
        PrintWriter pw = null;

        String storage = Factory.calculate(height);

        try {
            pw = new PrintWriter("mario.txt","UTF-8");
            pw.write(storage);
        } catch(UnsupportedEncodingException uee) {
            System.out.println(uee.getMessage());
        } catch(FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
            throw new RuntimeException();
        } finally {
            pw.close();
        }

    }
}
