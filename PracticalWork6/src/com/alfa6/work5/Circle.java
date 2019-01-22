package com.alfa6.work5;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public static Shape parseCircle(String string) {

        String[] words = string.split(":");
        String color = words[1];
        String sides = words[2];
        return new Circle(color, Double.parseDouble(sides));
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius=" + radius;
    }
}
