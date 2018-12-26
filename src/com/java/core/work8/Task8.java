package com.java.core.work8;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome! Enter your real number -> ");
        double number = scanner.nextDouble();
        String[] symbols = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        long cell = (int) number;
        System.out.println("cell " + cell);
        long length = ("" + number).split("\\.")[1].length();
        long drob = (long) ((BigDecimal.valueOf(number).subtract(BigDecimal.valueOf(cell)).doubleValue() )* Math.pow(10, length));
        System.out.println("drob " + drob);
        System.out.println("cell "+ cell);
        long sum = (cell + drob);

        String strSum = "" + sum;
        String result = "";
        System.out.println(sum);
        System.out.println(strSum);

        for (int i = 0; i < strSum.length(); i++) {
            int temp = strSum.charAt(i) - '0';
            System.out.println(temp);
            result += symbols[temp];
        }
        System.out.println("Your result is: " + result);

    }
}
