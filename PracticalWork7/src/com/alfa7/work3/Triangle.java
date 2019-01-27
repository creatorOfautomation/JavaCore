package com.alfa7.work3;

import java.util.Arrays;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Shape parseTriangle(String string) {

        String[] words = string.split(":");
        if (words.length != 3)
            throw new InvalidShapeStringException(String.format("Wrong format of string '%s'", string));
        String color = words[1];
        String sidesPart = words[2];
        String[] sides = sidesPart.split(",");
        if (sides.length != 3)
            throw new InvalidShapeStringException(String.format("Wrong sides for triangle '%s'", Arrays.toString(sides)));
        double a1 = Double.parseDouble(sides[0]);
        double b1 = Double.parseDouble(sides[1]);
        double c1 = Double.parseDouble(sides[2]);
        if (!(a1 + b1 > c1 && a1 + c1 > b1 && c1 + b1 > a1))
            throw new InvalidTrianlgeSidesException(String.format("Not a triangle with sides '%s'", Arrays.toString(sides)));
        return new Triangle(color, a1, b1, c1);
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return super.toString() +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c;
    }
}
