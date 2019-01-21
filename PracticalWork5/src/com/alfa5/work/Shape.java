package com.alfa5.work;

public abstract class Shape implements Drawable, Comparable {

    private String color;

    public String getColor() {
        return color;
    }

    public Shape(String color) {

        this.color = color;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "class= " + this.getClass().getSimpleName() +
                "color='" + color + '\'' +
                '}';
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
