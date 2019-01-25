package com.alfa7.work1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
//1
        /*int i;
        while (true) {
            System.out.print("Enter number1 -->");
            try {

                if (scanner.hasNextInt()){
                    i = scanner.nextInt();
                break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong number");
            }
        }
        System.out.print("Enter number2 -->");
        int i1 = scanner.nextInt();
        System.out.print("result is " + devisionInt(i, i1));  System.out.print("Enter number1 -->");*/

        try {
            System.out.print("Enter number1 -->");
            double d = scanner.nextDouble();
            System.out.print("Enter number2 -->");
            double d1 = scanner.nextDouble();
            System.out.print("result is " + divisionDouble(d, d1));
        } catch (ArithmeticException e) {
            System.out.println("Error occurred");
        }

    }

    public int devisionInt(int a, int b) {

        return Math.abs((a / b));
//        try {
//        } catch (ArithmeticException e) {
//            System.err.println("Division by 0!!!" + e.getMessage());
//
//            return 0;
//        }
    }

    public int divisionDouble(double a, double b) {

        if (b==0.0)
            throw new ArithmeticException("Div by zero");
        return Math.abs((int) (a / b));
//          return 0;
//        }
    }
}
