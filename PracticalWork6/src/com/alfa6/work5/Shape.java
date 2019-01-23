package com.alfa6.work5;

public abstract class Shape implements Drawable, Comparable {

    private String color;

    public String getColor() {
        return color;
    }

    public Shape(String color) {

        this.color = color;
    }

    public abstract double calcArea();

    public static Shape parseShape(String string) {

        String[] words = string.split(":");
        String figure = words[0];
        switch (figure.toUpperCase()) {
            case "RECTANGLE":
                return Rectangle.parseRectangle(string);
            case "CIRCLE":
                return Circle.parseCircle(string);
            case "TRIANGLE":
                return Triangle.parseTriangle(string);
            default:
                System.out.println("ERROR trying to parse string. Check figure");
                return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(Double.parseDouble("12.8"));
    }

    @Override
    public String toString() {
        return "class= " + this.getClass().getSimpleName() +
                " color='" + color + '\'';
    }


    @Override
    public void draw() {
        System.out.println(toString() + ", area=" + calcArea());

    }

    @Override
    public int compareTo(Object o) {
        Shape shape = (Shape) o;
        if (shape.calcArea() > this.calcArea()) return -1;
        if (shape.calcArea() < this.calcArea()) return 1;
        return 0;
    }
}
