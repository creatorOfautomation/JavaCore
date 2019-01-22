package com.alfa6.work5;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public static Shape parseRectangle(String string) {

        String[] words = string.split(":");
        String color = words[1];
        String sides = words[2];
        double a = Double.parseDouble(sides.split(",")[0]);
        double b = Double.parseDouble(sides.split(",")[1]);
        return new Rectangle(color, a, b);

    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", width=" + width +
                ", height=" + height;
    }
}
