package com.ryan.practice.Mario;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by carbo_000 on 3/12/2015.
 */
public class Mario {

    public static void main(String[] varArgs) {
        
        Mario obj = new Mario();
        obj.start();

    }

    public void start(){


        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Factory obj;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your preferred output\nEnter '1' for Console\nEnter '2' for TextFile\nOption: ");
        int option = scan.nextInt();
        System.out.print("Height: ");
        int height = scan.nextInt();


        if(option == 1) {
            obj = (Factory) context.getBean("console");
            obj.run(height);
        } else if(option == 2) {
            obj = (Factory) context.getBean("file");
            obj.run(height);
        }

    }

}
