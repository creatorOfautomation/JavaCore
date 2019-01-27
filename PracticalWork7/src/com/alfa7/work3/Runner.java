package com.alfa7.work3;

import java.util.Scanner;

public class Runner {


    public void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many figures do u want to create?");
        int size = scanner.nextInt();
        Shape[] shapes = new Shape[size];
        int counter = 0;

        System.out.println("Ok. Start to type figures that looks like a string 'Circle:BLACK:10' ");
        while (counter < size) {
            try {
                shapes[counter] = Shape.parseShape(scanner.next());
                counter++;
            } catch (InvalidShapeStringException e) {
                System.err.println(e.getMessage());
                System.err.println("Try again");
            }
            if (counter < size)
                System.out.println("OK. The next one -->");
        }
        System.out.println("You created next figures: ");
        for (Shape d : shapes) {
            System.out.println(d.toString());
        }
    }
}
