package com.ryan.practice.Mario;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by carbo_000 on 3/12/2015.
 */
public class Mario {

    public static void main(String[] varArgs) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");

        Mario obj = (Mario) context.getBean("Mario");
        obj.start();

    }

    private Factory factory;

    public Mario(Factory factory) {

        this.factory = factory;

    }
    public void start(){

        Mario m = new Mario(Factory.getInstance());
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your preferred output\nEnter '1' for Console\nEnter '2' for TextFile\nOption: ");
        int option = scan.nextInt();
        System.out.print("Height: ");
        int height = scan.nextInt();

        factory.run(option, height);

    }

}
