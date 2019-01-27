package com.alfa7.work3;

import java.util.Arrays;

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
        if (words.length != 3)
            throw new InvalidShapeStringException(String.format("Wrong format of string '%s'", string));
        String color = words[1];
        String sidesPart = words[2];
        String[] sides = sidesPart.split(",");
        if (sides.length != 2)
            throw new InvalidShapeStringException(String.format("Wrong sides for rectangle '%s'", Arrays.toString(sides)));
        double a = Double.parseDouble(sides[0]);
        double b = Double.parseDouble(sides[1]);
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
