package com.alfa.work1;

public class MyCalculate {

    public static double calcPi(int n) {

        double pi = 4;
        double znamennyk = 1;
        for (int i = 1; i <= n; i++) {
            znamennyk += 2;
            pi = (i % 2 == 0) ? (pi + (4 / znamennyk)) : (pi - (4 / znamennyk));
        }
        return pi;
    }

    public static void main(String[] args) {
        System.out.println(calcPi(1000000));
        System.out.println(System.currentTimeMillis());
    }
}
