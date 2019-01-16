package com.alfa.work2;

public class Runner {

    public void run() {

        Shape[] rec1 = getShape();
        for (Shape s : rec1) {
            System.out.println(s.toString() + "; the area is " + s.calcArea());
        }
        System.out.println("Total area is " + caalcTotalAreaShapes(rec1));
        System.out.println("Total area of circles is " + calcTotalAreaCircle(rec1));
    }

    private Shape[] getShape() {
        return new Shape[]{
                new Rectangle("Black", 12.0, 12.0),
                new Rectangle("Black", 13.0, 14.0),
                new Rectangle("Black", 13.0, 15.0),
                new Rectangle("Black", 14.0, 18.0),
                new Circle("White", 12.0),
                new Circle("White", 16.0),
                new Circle("White", 17.0),
                new Triangle("Blue", 15.5, 12.2, 13.2)
        };
    }

    private double caalcTotalAreaShapes(Shape[] shapes) {

        double res = 0.0;
        for (Shape s : shapes) {
            res += s.calcArea();
        }
        return res;
    }

    private double calcTotalAreaCircle(Shape[] shapes) {

        double sum = 0.0;
        for (Shape s : shapes) {
            if (s instanceof Circle) sum += s.calcArea();
        }
        return sum;
    }
}
