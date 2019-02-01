package com.alfa9.work1;

public class Runner {

    public void run() {

        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] doubles = {1.0, 4.0, 1.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};

        System.out.println("count = " + MyTestMethod.<Integer>calcNum(integers, 2));
        System.out.println("count = " + MyTestMethod.<Integer>calcNum(integers, 2));

        System.out.println("sum = " + MyTestMethod.<Integer>calcSum(integers, 2));
        System.out.println("int = " + MyTestMethod.<Double>calcSum(doubles, 2.0  ));

     }


}
