package com.alfa5.work;

import java.util.Arrays;

public class Runner {

    public void run() {

        Shape[] shape = getShape();
     //   printShapes(shape);

        Rectangle rectangle1 = new Rectangle("Black", 10, 20);
        Rectangle rectangle2 = new Rectangle("White", 10, 30);

        System.out.println(rectangle2.compareTo(rectangle1));

        Arrays.sort(shape);
        printShapes(shape);
        Arrays.sort(shape, new ShapeComparator());
        System.out.println();
        printShapes(shape);
    }


    private Shape[] getShape() {
        return new Shape[]{
                new Rectangle("Black", 12.0, 12.0),
                new Rectangle("Black", 13.0, 14.0),
                new Rectangle("Black", 13.0, 15.0),
                new Rectangle("Black", 14.0, 18.0),
                new Circle("Green", 12.0),
                new Circle("White", 16.0),
                new Circle("White", 17.0),
                new Triangle("Blue", 15.5, 12.2, 13.2)
        };
    }


    public void printShapes(Shape[] shapes) {


        for (Shape s :
                shapes) {
            s.draw();
        }
    }

}
