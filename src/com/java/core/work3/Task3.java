package com.java.core.work3;

public class Task3 {

    public static void main(String[] args) {

        int i = 1;
        int k = 1;
        System.out.println("*| 1  2  3  4  5  6  7  8  9");
        System.out.println("--------------------------------------");

        while (i < 10) {

            System.out.print(i + " | ");
            while (k < 10) {
                System.out.print(k * i + " ");
                k++;

            }
            k = 1;
            System.out.println();
            i++;


        }

    }
}
