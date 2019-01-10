package com.alfa.work1;

public class MyCalculate {

    public static double calcPi(int n) {

        double result = 4;
        double znamennyk = 1;
        for (int i = 1; i <= n + 1; i++) {
            znamennyk += 2;
            result = (i % 2 == 0) ? (result + (4 / znamennyk)) : (result - (4 / znamennyk));
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(calcPi(1000000));
    }
}
