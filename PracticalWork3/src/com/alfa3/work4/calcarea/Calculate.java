package com.alfa3.work4.calcarea;

public class Calculate {

    public static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static int areaSquare(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        System.out.println(Calculate.areaSquare(22));
    }
}
