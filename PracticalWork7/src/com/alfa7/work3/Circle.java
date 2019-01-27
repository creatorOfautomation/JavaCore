package com.alfa7.work3;

import java.util.Arrays;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public static Shape parseCircle(String string) {

        String[] words = string.split(":");
        if (words.length != 3)
            throw new InvalidShapeStringException(String.format("Wrong format of string '%s'", string));
        String color = words[1];
        String[] sides = words[2].split(",");
        if (sides.length!=1)
            throw new InvalidShapeStringException(String.format("Wrong sides for circle '%s'", Arrays.toString(sides)));
        return new Circle(color, Double.parseDouble(sides[0]));
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
