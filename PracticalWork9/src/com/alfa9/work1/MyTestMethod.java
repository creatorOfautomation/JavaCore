package com.alfa9.work1;

public class MyTestMethod {

    public static <T extends Number> int calcNum(T[] arr, T maxValue) {
        int counter = 0;

        for (T elem :
                arr) {
            if (elem.doubleValue() > maxValue.doubleValue()) {
                counter++;
            }
        }
        return counter;
    }

    public static <T extends Number> double calcSum(T[] arr, T maxvalue) {
        double sum = 0;

        for (T elem :
                arr) {
            if (elem.doubleValue() > maxvalue.doubleValue()) {
                sum += elem.doubleValue();
            }
        }

        return sum;
    }
}
