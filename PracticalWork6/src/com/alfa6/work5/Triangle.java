package com.alfa6.work5;

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
        String color = words[1];
        String sides = words[2];
        double a1 = Double.parseDouble(sides.split(",")[0]);
        double b1 = Double.parseDouble(sides.split(",")[1]);
        double c1 = Double.parseDouble(sides.split(",")[2]);
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
